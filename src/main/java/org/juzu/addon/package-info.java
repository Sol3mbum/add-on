@juzu.Application(defaultController = Controller.class)
@WebJars(@WebJar("jquery"))
@Stylesheets({@Stylesheet(value = "styles/linkedin.css")})
@Scripts({
        @Script(id = "jquery", value = "jquery/1.10.2/jquery.js"),
        @Script(value = "javascripts/popup.js", depends = "jquery")
})
//@Servlet("http://localhost:8080/portal/intranet/yoda/popup.java")
@Assets("*")
package org.juzu.addon;

import juzu.plugin.asset.*;
import juzu.plugin.webjars.WebJar;
import juzu.plugin.webjars.WebJars;
import org.juzu.addon.oauth.linkedin.Controller;
