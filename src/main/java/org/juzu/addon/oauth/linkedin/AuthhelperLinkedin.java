package org.juzu.addon.oauth.linkedin;

/**
 * Created by aabbasi on 12/11/15.
 */
public class AuthhelperLinkedin {


    ConnectionImpl linkedinConnectionImpl;

    public AuthhelperLinkedin() {
        linkedinConnectionImpl = new ConnectionImpl();
    }

    public String getLoginUrl(){
        return linkedinConnectionImpl.authenticateURL();
    }

    public String getStateToken() {
        return this.linkedinConnectionImpl.getStateToken();
    }

    /*public HashMap<String, String> getUsernameFromTokenCode(String authorization_code) {

        HashMap<String, String> map = null;
        JSONObject jsonObject = this.linkedinConnectionImpl.getUserInfo(authorization_code);
        if(null != jsonObject){
            map = UserService.userConnect("linkedin",
                    jsonObject,
                    this.getMktoCookie());
                    //this.getMktoAttributes());
        }
        return map;
    }*/
}
