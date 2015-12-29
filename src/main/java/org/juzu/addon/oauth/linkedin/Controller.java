package org.juzu.addon.oauth.linkedin;
import juzu.Path;
import juzu.Response;
import juzu.View;

import javax.inject.Inject;
import java.io.IOException;

public class Controller {

  @Inject
  @Path("index.gtmpl")
  org.juzu.addon.templates.index indexTpl;


  @View
  public Response.Content index() throws IOException{
    //Launch launch = new Launch();
    //ConnectionImpl connection = new ConnectionImpl();
    //popup popup = new popup();
    return Response.ok("something went wrong, cannot get user info");
  }

//    @Action
//    public Response.View process() throws IOException{
//        return Controller_.index();
//    }
}
