package com.ls.main;

public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response,FilterChain chain) {
		// TODO Auto-generated method stub
		request.setRequestStr(request.getRequestStr().replace("√Ù∏–", "“ª∞„")+"SensitiveFilter--");
	   chain.doFilter(request, response, chain);
	   response.setResposeStr(response.getResposeStr()+"SensitiveFilter--");
	}

}
