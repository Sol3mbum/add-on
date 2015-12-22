package org.juzu.addon.oauth.linkedin;

/**
 * Created by aabbasi on 12/14/15.
 */
public class LogoutFilter{

        /*public static final String COOKIE_NAME_OAUTH = "rememberoauth";
        private static final Log log = ExoLogger.getLogger(LogoutFilter.class);
        private String getRememberMeTokenCookie(HttpServletRequest req) {
            Cookie[] cookies = req.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (COOKIE_NAME_OAUTH.equals(cookie.getName())) {
                        return cookie.getValue();
                    }
                }
            }
            return null;
        }

        public void doFilter(ServletRequest request, ServletResponse response,
                             FilterChain chain) throws IOException, ServletException {


            HttpServletRequest req = (HttpServletRequest) request;
            HttpServletResponse res = (HttpServletResponse) response;

            if (!isProcessFilter(req)) {
                chain.doFilter(request, response);
            } else {

                // for issue ORG-1118
                request.setCharacterEncoding("UTF-8");
                response.setCharacterEncoding("UTF-8");

                String action = request.getParameter("portal:action");
                try {
                    if (action != null && action.equals("Logout") && null != this.getRememberMeTokenCookie(req)) {
                        HttpSession session = req.getSession(true);
                        Cookie cookie = new Cookie(COOKIE_NAME_OAUTH, "");
                        cookie.setPath(req.getContextPath());
                        cookie.setMaxAge(0);
                        res.addCookie(cookie);
                        // call jaas to remove all session
                        session.invalidate();
                        res.sendRedirect("/portal");
                        return;
                    }
                } catch (Exception e) {

                }

                chain.doFilter(request, response);
            }
        }

        private Boolean isProcessFilter(HttpServletRequest req){
            try{
                URL url = new URL(req.getRequestURL().toString());
                String path = url.getPath();
                if(path.indexOf(".js") >= 0 || path.indexOf(".css") >= 0 || path.indexOf("/portal/skins/") >= 0 || path.indexOf("/portal/login") >= 0 || path.indexOf("/portal/scripts/") >= 0 || path.startsWith("/rest") || path.startsWith("/portal/rest") ){
                    return false;
                }
            }catch(Exception e){
                log.error("=== ERR check process filter");
            }
            return true;
        }*/
}
