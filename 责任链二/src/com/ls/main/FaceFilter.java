package com.ls.main;

public class FaceFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response,FilterChain chain) {
		// TODO Auto-generated method stub
		request.setRequestStr(request.getRequestStr().replace("����", "VVVV")+"FaceFilter--");
	    chain.doFilter(request, response, chain);
	    response.setResposeStr(response.getResposeStr()+"FaceFilter--");
	}

}
