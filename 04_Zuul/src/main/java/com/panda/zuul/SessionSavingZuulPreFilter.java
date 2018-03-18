package com.panda.zuul;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * Filter adds the session id to the redirected request.
 */
@Component
public class SessionSavingZuulPreFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public Object run() {
		RequestContext context = RequestContext.getCurrentContext();
		HttpSession httpSession = context.getRequest().getSession();
		context.addZuulRequestHeader("Cookie", "SESSION=" + httpSession.getId());
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

}
