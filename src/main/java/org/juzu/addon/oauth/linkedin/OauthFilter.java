package org.juzu.addon.oauth.linkedin;

/**
 * Created by aabbasi on 12/14/15.
 */

public class OauthFilter {

        /*private static final Log log = ExoLogger.getLogger(OauthFilter.class);
        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		try {
            HttpServletRequest req = (HttpServletRequest) request;
            HttpServletResponse res = (HttpServletResponse) response;
            //ServletAccess.setRequestAndResponse(req,res);
 /*       } catch (Exception e) {
    		log.error(" ===== Error common oauth filter ================ ",e);

        }*/
/*    IRegisterService registerService = CommonsUtils.getService(IRegisterService.class);
    String username = req.getParameter("username");
    String usernameReqAtt = (String) req.getAttribute("username");
    if (null != username && !"".equals(username) && registerService.isPending(username) && !"".equals(usernameReqAtt)){
      req.setAttribute("username","");
      res.sendRedirect("/portal/login?username="+username);
      return;
    }
            chain.doFilter(request, response);
        }


        public void destroy(){

        }*/
}
