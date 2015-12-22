package org.juzu.addon.oauth.linkedin;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;
import org.json.JSONObject;
import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.LinkedInApi;
import org.scribe.model.*;
import org.scribe.oauth.OAuthService;

import java.io.InputStream;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by aabbasi on 12/10/15.
 */
public class ConnectionImpl implements Connection{


    //public static String CONSUMER_KEY =System.getProperty( "oauth.linkedin.api.key");
    public static String CONSUMER_KEY = ("75fjmdg84jo1wn");

    //public static String CONSUMER_SECRET =System.getProperty( "oauth.linkedin.secret.key");
    public static String CONSUMER_SECRET = ("Is10pCJ2aT1kjZN3");

    public static String LINKEDIN_CALLBACK_URI =System.getProperty( "oauth.linkedin.callback.url");

    private static final Log log = (Log) ExoLogger.getLogger(ConnectionImpl.class);
    private Token accessToken;
    private Token requestToken;
    private final OAuthService service;
    private String stateToken = null;


    public ConnectionImpl() {
        this.service = new ServiceBuilder()
                .provider(LinkedInApi.class)
                .apiKey("75fjmdg84jo1wn")
                .apiSecret("Is10pCJ2aT1kjZN3")
                .build();
        this.generateStateToken();
    }

    private void generateStateToken() {
        SecureRandom sr1 = new SecureRandom();
        this.stateToken = String.valueOf(sr1.nextInt());
    }

    @Override
    public String authenticateURL() {
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("type", "login");
        return AUTHORIZE_URL + this.generateParams(data);
    }

    @Override
    public String requestAccessURL(String authorization_code){
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("type", "reqAT");
        data.put("AUTHORIZATION_CODE", authorization_code);
        return REQUEST_ACCESS_URL+ this.generateParams(data);
    }

    public String userInfoUser(String accessToken){
        return CURRENT_PROFILE_USER_URL+"?oauth2_access_token="+accessToken+"&format=json";
    }

    public String getStateToken() {
        return this.stateToken;
    }
    private String generateParams(HashMap<String, String> data) {

        List<NameValuePair> params = new LinkedList<NameValuePair>();
        params.add(new BasicNameValuePair("redirect_uri", LINKEDIN_CALLBACK_URI));
        params.add(new BasicNameValuePair("client_id", "75fjmdg84jo1wn"));
        if (data.get("type").equals("reqAT")) {
            params.add(new BasicNameValuePair("grant_type", "authorization_code"));
            params.add(new BasicNameValuePair("code", data.get("AUTHORIZATION_CODE")));
            params.add(new BasicNameValuePair("client_secret", "Is10pCJ2aT1kjZN3"));
        } else if (data.get("type").equals("login")) {
            params.add(new BasicNameValuePair("response_type", "code"));
            params.add(new BasicNameValuePair("scope", "r_basicprofile r_emailaddress"));
            params.add(new BasicNameValuePair("state", this.getStateToken()));
        }
        return URLEncodedUtils.format(params, "utf-8").replace("/+/", "%20");
    }
    public JSONObject getUserInfo(String authorization_code){
        try {
            JSONObject jsonObjectAT = new JSONObject(this.get(this.requestAccessURL(authorization_code)).getBody());
            if (jsonObjectAT.has("access_token")) {
                String accessToken = (String) jsonObjectAT.get("access_token");
                try {
                    return new JSONObject(this.get(this.userInfoUser(accessToken)).getBody());
                }catch(Exception e){
                    log.error(" ERROR while gettting userinfo from tokencode", e);
                }
            }
        } catch (Exception e) {
            log.error(" ERROR while gettting tokencode", e);
        }
        return null;

    }
    @Override
    public String[] authorize(String code) {
        final Verifier verifier = new Verifier(code);
        this.accessToken = this.service.getAccessToken(this.requestToken, verifier);
        if (this.accessToken == null ) {
            return null;
        }
        final String token = this.accessToken.getToken();
        final String secret = this.accessToken.getSecret();
        return new String[] { token, secret };
    }

    @Override
    public SiteResponse get(String url) {
        final OAuthRequest request = new OAuthRequest(Verb.GET, url);
        return new ScribeResponseImpl(request.send());
    }

    @Override
    public void init(String authToken, String authSecret) {
        this.accessToken = new Token(authToken, authSecret);
    }
    @Override
    public int signOut() {
        return get(SIGN_OUT_URL).getCode();
    }

    public class ScribeResponseImpl implements SiteResponse {
        private final Response response;

        public ScribeResponseImpl(final Response response) {
            super();
            this.response = response;
        }

        @Override
        public String getBody() {
            return this.response.getBody();
        }

        @Override
        public int getCode() {
            return this.response.getCode();
        }

        @Override
        public String getHeader(final String name) {
            return this.response.getHeader(name);
        }

        @Override
        public Map getHeaders() {
            return this.response.getHeaders();
        }

        @Override
        public InputStream getStream() {
            return this.response.getStream();
        }
    }
}
