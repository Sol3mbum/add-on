package org.juzu.addon.oauth.linkedin;
import juzu.Path;
import juzu.Response;
import juzu.View;
import juzu.template.Template;

import javax.inject.Inject;
import java.io.IOException;

public class Controller {

  @Inject
  @Path("index.gtmpl")
  Template index;


  @View
  public Response.Content index() throws IOException{
    //Launch launch = new Launch();
    //ConnectionImpl connection = new ConnectionImpl();
    //popup popup = new popup();
    return index.ok();
  }

//    @Action
//    public Response.View process() throws IOException{
//        return Controller_.index();
//    }
}
