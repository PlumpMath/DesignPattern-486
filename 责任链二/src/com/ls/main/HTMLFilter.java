package com.ls.main;

public class HTMLFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response,FilterChain chain) {
		// TODO Auto-generated method stub
		request.setRequestStr(request.getRequestStr().replace("<", "[")
				.replace(">", "]")+"HTMLFilter--");
		chain.doFilter(request, response, chain);//�ٴ��{��FilterChain��������Ȩ����FilterChain
		response.setResposeStr(response.getResposeStr()+"HTMLFilter--");
	}

}
