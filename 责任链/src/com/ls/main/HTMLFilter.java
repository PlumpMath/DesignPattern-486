package com.ls.main;

public class HTMLFilter implements Filter {

	@Override
	public String doFilter(String str) {
		// TODO Auto-generated method stub
		String r = str.replace("<", "[").replace(">", "]");
		return r;
	}

}
