package org.juzu.addon.oauth.linkedin;

import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;



/**
 * Created by aabbasi on 12/14/15.
 */
public class LinkedInFilter  //implements org.exoplatform.web.filter.Filter
{

        private static final Log log = (Log) ExoLogger.getLogger(LinkedInFilter.class);

        //@Override
        public void doFilter() //(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
                //ServletException
        {

            log.debug("============================ OAuth linkedin filter =======================");
            //HttpServletRequest req = (HttpServletRequest) request;
            //HttpServletResponse res = (HttpServletResponse) response;
            //HttpSession session = req.getSession(true);
            String loginMethod = "";
            String oauth_initialURI = "/portal";
            AuthhelperLinkedin helper = new AuthhelperLinkedin();
            //String code = request.getParameter("code");
            //String stateRes = request.getParameter("state");
            //String stateReq = (String) session.getAttribute("state");

            //String loggedUser = req.getRemoteUser();
            /*if (loggedUser != null) {
                res.sendRedirect("/portal");
                return;
            }
            session.setAttribute("oauth_error", true);
            session.setAttribute("oauthProvider", "linkedin");
            String _mkt_trk = null;
            if (code == null || stateReq == null || stateRes == null || "".equals(code)
                    || "".equals(stateReq) || "".equals(stateRes) || !stateRes.equals(stateReq)) {

                _mkt_trk = request.getParameter("_mkt_trk");
                session.setAttribute("_mkt_trk", _mkt_trk);
                String oauth_rememberme = request.getParameter("oauth_rememberme");
                session.setAttribute("oauth_rememberme", oauth_rememberme);
                session.setAttribute("state", helper.getStateToken());
                String loginUrl = helper.getLoginUrl();
                if (null != request.getParameter("oauth_initialURI"))
                    oauth_initialURI = request.getParameter("oauth_initialURI");
                session.setAttribute("oauth_initialURI", oauth_initialURI);
                if (null != request.getParameter("loginMethod"))
                    loginMethod = request.getParameter("loginMethod");
                session.setAttribute("loginMethod", loginMethod);
                res.sendRedirect(loginUrl);
                return;
            } else if (code != null && stateRes != null && stateReq != null && stateRes.equals(stateReq)) {
                _mkt_trk = (String) session.getAttribute("_mkt_trk");
                session.removeAttribute("_mkt_trk");
                if (_mkt_trk == null || "".equals(_mkt_trk)) {
                    //_mkt_trk = ORGUtils.getCookieByName("_mkt_trk", req);
                    log.info(" mkt trk from cookie " + _mkt_trk);
                }
                log.info(" mkt trk value in filter " + _mkt_trk);
                helper.setMktoCookie(_mkt_trk);
                loginMethod = (String) session.getAttribute("loginMethod");
                session.removeAttribute("loginMethod");
                helper.setLoginMethod(loginMethod);
                session.removeAttribute("state");
                oauth_initialURI = (String) session.getAttribute("oauth_initialURI");
                session.removeAttribute("oauth_initialURI");
                helper.setCookies(req.getCookies());
                HashMap<String, String> map = helper.getUsernameFromTokenCode(code);
                String username = null;
                String registerToken = null;
                if(map != null){
                    if(map.containsKey("username"))
                        username = map.get("username");
                    else if(map.containsKey("error"))
                        session.setAttribute("oauth_error_nomail",true);

                    if(map.containsKey("registerToken")){
                        registerToken = map.get("registerToken");
                    }
                }
                if (username != null) {
                    SecureRandom random = new SecureRandom();
                    String password = new BigInteger(130, random).toString(32);
                    session.setAttribute("oauth_username", username);
                    session.setAttribute("oauth_password", password);
                    session.removeAttribute("oauth_error");
                    session.removeAttribute("oauth_error_nomail");
                    //ORGUtils.debugTemp(req,username);
                    String loginURL = "/portal";
                    oauth_initialURI = URLEncoder.encode(oauth_initialURI, "UTF-8");
                    if (null != registerToken){
                        loginURL = "/portal/intranet/register-confirm?token="+registerToken;
                    }else{
                        loginURL = "/portal/login?username=" + helper.genereteUserName4LoginUrl(username) + "&password=" + password+"&initialURI=" + oauth_initialURI;
                    }
                    res.sendRedirect(loginURL);
                    return;

                } else {
                    log.info("cannot create user via linkedin oauth ");
                }

            } else {
                log.info("something wrong with linkedin");
            }
            res.sendRedirect("/portal/login?username=null&password=null");
            return;*/

        }

        public void destroy() {
        }
}
