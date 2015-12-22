package org.juzu.addon.oauth.linkedin;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by aabbasi on 12/21/15.
 */
@WebServlet(
        urlPatterns = {"/popup"})
public class popup extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        /*String paramWidth = request.getParameter("width");
        int width = Integer.parseInt(paramWidth);

        String paramHeight = request.getParameter("height");
        int height = Integer.parseInt(paramHeight);

        long area = width * height;

        PrintWriter writer = response.getWriter();
        writer.println("<html>Area of the rectangle is: " + area + "</html>");
        writer.flush();*/
        PrintWriter writer = response.getWriter();
        writer.println("<html><body><div id=\"popup\">\n" +
                "    <div class=\"popup_block\">\n" +
                "        <a class=\"close\" href=\"#fermer\"><img alt=\"Annuler import\" class=\"btn_close\" src=\"\"></a>\n" +
                "        <h2>Sections to import</h2>\n" +
                "        <form method=\"post\" action=\"importation.php\">\n" +
                "        <div class=\"accordion\">\n" +
                "            <div class=\"accordion-section\">\n" +
                "                <a class=\"accordion-section-title\" href=\"#accordion-1\">Headline</a>\n" +
                "                <label><input type=\"checkbox\" class=\"btn-import\" checked />Import</label><br/>\n" +
                "                <div id=\"accordion-1\" class=\"accordion-section-content\">\n" +
                "                    <p>quantus spiritus amen</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <form>\n" +
                "            <div class=\"accordion-section\">\n" +
                "                <label><input type=\"checkbox\" class=\"btn-import\" id=\"importp\"/>Import all positions</label>\n" +
                "                <a class=\"accordion-section-title\" href=\"#accordion-2\">Position</a>\n" +
                "                <div id=\"accordion-2\" class=\"accordion-section-content\">\n" +
                "                     <div class=\"accordion\">\n" +
                "                               <div class=\"accordion-section\">\n" +
                "                                   <label><input type=\"checkbox\" class=\"btnp\"/>Import</label><br/>\n" +
                "                                   <a class=\"accordion-section-title-bis\" href=\"#accordion-a\">Dieu</a>\n" +
                "                                   <div id=\"accordion-a\" class=\"accordion-section-content-bis\">\n" +
                "                                       <p>quantum spiritus<br>amen</p>\n" +
                "                                   </div>\n" +
                "                               </div>\n" +
                "                               <div class=\"accordion-section\">\n" +
                "                                   <label><input type=\"checkbox\" class=\"btnp\"/>Import</label><br/>\n" +
                "                                   <a class=\"accordion-section-title-bis\" href=\"#accordion-b\">Poete</a>\n" +
                "                                   <div id=\"accordion-b\" class=\"accordion-section-content-bis\">\n" +
                "                                        <p>I'm Batman</p>\n" +
                "                                   </div>\n" +
                "                               </div>\n" +
                "                               <div class=\"accordion-section\">\n" +
                "                                   <label><input type=\"checkbox\" class=\"btnp\"/>Import</label><br/>\n" +
                "                                   <a class=\"accordion-section-title-bis\" href=\"#accordion-c\">May38</a>\n" +
                "                                   <div id=\"accordion-c\" class=\"accordion-section-content-bis\">\n" +
                "                                        <p>test</p>\n" +
                "                                   </div>\n" +
                "                               </div>\n" +
                "                               <div class=\"accordion-section\">\n" +
                "                                   <label><input type=\"checkbox\" class=\"btnp\"/>Import</label><br/>\n" +
                "                                   <a class=\"accordion-section-title-bis\" href=\"#accordion-d\">LinkedLink</a>\n" +
                "                                   <div id=\"accordion-d\" class=\"accordion-section-content-bis\">\n" +
                "                                       <p>reddit.com/r/all</p>\n" +
                "                                   </div>\n" +
                "                               </div>\n" +
                "                     </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            </form>\n" +
                "            <div class=\"accordion-section\">\n" +
                "                <label><input type=\"checkbox\" class=\"btn-import\" checked />Import</label><br/>\n" +
                "                <a class=\"accordion-section-title\" href=\"#accordion-3\">Summary</a>\n" +
                "                <div id=\"accordion-3\" class=\"accordion-section-content\">\n" +
                "                    <p>Advenit post multos Scudilo Scutariorum tribunus velamento subagrestis ingenii persuasionis opifex callidus. qui eum adulabili sermone seriis admixto solus omnium proficisci pellexit vultu adsimulato saepius replicando quod flagrantibus votis eum videre frater cuperet patruelis, siquid per inprudentiam gestum est remissurus ut mitis et clemens, participemque eum suae maiestatis adscisceret, futurum laborum quoque socium, quos Arctoae provinciae diu fessae poscebant.</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "\n" +
                "            <div class=\"accordion-section\">\n" +
                "                <label><input type=\"checkbox\" class=\"btn-import\" checked />Import</label><br/>\n" +
                "                <a class=\"accordion-section-title\" href=\"#accordion-4\">LinkedIn profile link</a>\n" +
                "                <div id=\"accordion-4\" class=\"accordion-section-content\">\n" +
                "                    <p>Direct link to your LinkedIn profile:<br>https://vn.linkedin.com/in/antoineabbasi</p>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <label><input  type=\"checkbox\" id=\"importall\" >Import all sections</label>\n" +
                "        </div>\n" +
                "        <br>\n" +
                "        </form>\n" +
                "        <p>The selected sections will replace the ones in your eXo profile, whether it was filled or not</p>\n" +
                "        <a href=\"#\"><button type=\"submit\">Submit</button></a>\n" +
                "    </div>\n" +
                "</div></body></html>");
        writer.flush();

    }
}