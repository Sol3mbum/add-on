package org.juzu.addon.oauth.linkedin;

import java.io.InputStream;
import java.util.Map;


/**
 * Created by aabbasi on 12/11/15.
 */
public interface Connection {
    String AUTHORIZE_URL = "https://www.linkedin.com/uas/oauth2/authorization?";
    String REQUEST_ACCESS_URL = "https://www.linkedin.com/uas/oauth2/accessToken?";
    String CURRENT_PROFILE_USER_URL = "https://api.linkedin.com/v1/people/~:(id,first-name,last-name,email-address,picture-url)";
    String SIGN_OUT_URL = "https://api.linkedin.com/uas/oauth/invalidateToken";

    String authenticateURL();
    String requestAccessURL(String authorization_code);
    String userInfoUser(String accessToken);
    String[] authorize(String code);
    SiteResponse get(String url);

    void init(String authToken, String authSecret);

    int signOut();

    public interface SiteResponse {
        public abstract String getBody();

        public abstract int getCode();

        public abstract String getHeader(final String name);

        public abstract Map getHeaders();

        public abstract InputStream getStream();
    }
}
