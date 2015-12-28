@juzu.Application(defaultController = Controller.class)
@Stylesheets({@Stylesheet(value = "styles/linkedin.css")})
@WebJars(@WebJar("jquery"))
@Scripts({
        @Script(id = "jquery", value = "jquery/1.10.2/jquery.js"),
        @Script(value = "javascripts/popup.js", depends = "jquery")
})
@Assets("*")
package org.juzu.addon;

import juzu.plugin.asset.*;
import juzu.plugin.webjars.WebJar;
import juzu.plugin.webjars.WebJars;
import org.juzu.addon.oauth.linkedin.Controller;
