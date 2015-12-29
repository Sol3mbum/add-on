@juzu.Application(defaultController = org.juzu.addon.oauth.linkedin.Controller.class)
@Portlet(name="LinkedinPortlet")
@WebJars(@WebJar("jquery"))
@Scripts({
        @Script(id = "jquery", value = "jquery/1.10.2/jquery.js"),
        @Script(value = "javascripts/popup.js", depends = "jquery")
})
@Stylesheets({@Stylesheet(value = "styles/linkedin.css")})
@Assets("*")
package org.juzu.addon;

import juzu.plugin.asset.*;
import juzu.plugin.portlet.Portlet;
import juzu.plugin.webjars.WebJar;
import juzu.plugin.webjars.WebJars;
