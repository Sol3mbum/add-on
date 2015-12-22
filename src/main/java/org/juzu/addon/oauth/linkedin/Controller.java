package org.juzu.addon.oauth.linkedin;
import juzu.Path;
import juzu.Response;
import juzu.View;
import juzu.template.Template;

import javax.inject.Inject;

public class Controller {

  @Inject
  @Path("index.gtmpl")
  Template index;

  /*@Inject
  @Path("oauth.gtmpl")
  Template oauth;

  @View
  public Response.Content linkedInForm(){
    return oauth.ok();
  }*/

  @View
  public Response.Content index(){
    //Launch launch = new Launch();
    //ConnectionImpl connection = new ConnectionImpl();
    popup popup = new popup();
    return index.ok();
  }
}
