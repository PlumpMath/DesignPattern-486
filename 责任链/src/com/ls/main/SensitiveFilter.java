package com.ls.main;

public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String str) {
		// TODO Auto-generated method stub
		return  str.replace("√Ù∏–", "“ª∞„");
	}

}
