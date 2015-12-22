package org.juzu.addon.oauth.linkedin;


import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.LinkedInApi;
import org.scribe.model.*;
import org.scribe.oauth.OAuthService;

import java.util.Scanner;

/**
 * Created by aabbasi on 12/15/15.
 */
public class Launch {

    private static final String url =
        "http://api.linkedin.com/v1/people/~/connections:(id,first-name,last-name,email-address,picture-url)";
    public Launch() {
        OAuthService service = new ServiceBuilder()
                .provider(LinkedInApi.class)
                .apiKey("75fjmdg84jo1wn")
                .apiSecret("Is10pCJ2aT1kjZN3")
                //.callback("")
                .build();
        Scanner in = new Scanner(System.in);

        Token requestToken = service.getRequestToken();

        //System.out.println("https://www.linkedin.com/uas/oauth/authorize?oauth_token=75--6b019f82-b058-4f4f-bf2a-aa55284159d7");
        System.out.println(service.getAuthorizationUrl(requestToken));
        //String authUrl = service.getAuthorizationUrl(requestToken);
        //Verifier v = new Verifier("verifier you got from the user");
        String str = "09870";
        //Verifier verifier = new Verifier(in.nextLine());
        Verifier verifier = new Verifier(str);
        Token accessToken = service.getAccessToken(requestToken, verifier); // the requestToken you had from step 2

        OAuthRequest request = new OAuthRequest(Verb.GET, url);
        service.signRequest(accessToken, request); // the access token from step 4
        Response response = request.send();
        System.out.println(response.getBody());
    }
}
