package com.sermo.xx.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.sermo.xx.constant.Globals;

/**
 * @author sermo
 * @version 2016年7月15日 
 */

public class LoginInterceptor extends HandlerInterceptorAdapter{

	private final Logger log = LoggerFactory.getLogger(LoginInterceptor.class); 
	
	private List<String> excludeSuffixs;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		String requestUri = request.getRequestURI();
	    String contextPath = request.getContextPath();
	    String url = requestUri.substring(contextPath.length());
		if (isExcludeRequest(url)) {
			return true;
		}else {
			Object object = request.getSession().getAttribute(Globals.USER_SESSION);
			if (object == null) {
				log.info("Interceptor：跳转到login页面！");
				response.sendRedirect("/sermo/login");
			}else {
				return true;
			}
		}
		return false;
	}
	
	public void setExcludeSuffixs(List<String> excludeSuffixs) {
		this.excludeSuffixs = excludeSuffixs;
	}
	
	private boolean isExcludeRequest (String path) {
		for (String suffix : excludeSuffixs) {
			if (path.endsWith(suffix)) {
				return true;
			}
		}
		return false;
	}
}
