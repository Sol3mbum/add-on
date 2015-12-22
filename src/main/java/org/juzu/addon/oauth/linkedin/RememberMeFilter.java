package org.juzu.addon.oauth.linkedin;

/**
 * Created by aabbasi on 12/11/15.
 */
public class RememberMeFilter {
/*
    public static final String COOKIE_NAME_OAUTH = "rememberoauth";
    private static final Log log = ExoLogger.getLogger(RememberMeFilter.class);
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        doFilter((HttpServletRequest) request, (HttpServletResponse) response, chain);
    }

    private String getRememberMeTokenCookie(HttpServletRequest req) {
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (COOKIE_NAME_OAUTH.equals(cookie.getName())) {
                    log.info(" ==== oauth-rememberme === found cookie ");
                    return cookie.getValue();
                }
            }
        }
        return null;
    }

    private void doFilter(HttpServletRequest req, HttpServletResponse resp,
                          FilterChain chain) throws IOException, ServletException {
        ServletRequest request = (ServletRequest) req;
        ServletResponse response = (ServletResponse) resp;

        if (req.getRemoteUser() == null) {
            String token = getRememberMeTokenCookie(req);
            if (token != null) {
                log.info(" ==== token ok => start process oauth-rememberme === ");
                ExoContainer container = ExoContainerContext.getCurrentContainer();
                CookieTokenService tokenservice = (CookieTokenService) container.getComponentInstanceOfType(CookieTokenService.class);
                //Credentials credentials = tokenservice.validateToken(token, false);
                Cookie cookie = new Cookie(COOKIE_NAME_OAUTH, "");
                // for issue ORG-1118
                request.setCharacterEncoding("UTF-8");
                response.setCharacterEncoding("UTF-8");

                /*if (credentials != null) {
                    try {
                        log.info(" === oauth remember-me: credential ok  === ");
                        String oauth_initialURI = "";
                        if (null != request.getParameter("oauth_initialURI"))
                            oauth_initialURI = request.getParameter("oauth_initialURI");
                        else if(null != request.getParameter("initialURI")){
                            oauth_initialURI = request.getParameter("initialURI");
                        }else{
                            oauth_initialURI = req.getRequestURL().toString();
                        }
                        String username = credentials.getUsername();
                        SecureRandom random = new SecureRandom();
                        String password = new BigInteger(130, random).toString(32);
                        HttpSession session = req.getSession(true);
                        session.setAttribute("oauth_rememberme","1");
                        session.setAttribute("oauth_rememberme_existing","1");
                        session.setAttribute("oauth_username", username);
                        log.info("=== Start remember me for oauth with username = " + username+" from "+req.getRequestURL().toString() + " =====");
                        session.setAttribute("oauth_password", password);
                        if(!req.getRequestURI().contains("login")){
                            resp.sendRedirect("/portal/login?username=" + username + "&password=" + password+ "&initialURI=" + oauth_initialURI);
                            return;
                        }
                    } catch (Exception e) {
                        log.error(" === oauth remember-me: something went wrong  === ");
                        log.error(e.getMessage());
                    }
                }
                // Clear token cookie if we did not authenticate
                else {

                    log.info("=== oauth remember-me: cannot auto-login");
                    cookie.setPath(req.getContextPath());
                    cookie.setMaxAge(0);
                    resp.addCookie(cookie);
                    resp.sendRedirect("/portal/login");
                    return;
                }
            }

        }

        // Continue
        chain.doFilter(request, response);
    }*/

}
