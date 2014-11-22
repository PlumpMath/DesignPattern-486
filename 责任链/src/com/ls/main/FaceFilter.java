package com.ls.main;

public class FaceFilter implements Filter {

	@Override
	public String doFilter(String str) {
		// TODO Auto-generated method stub
		return str.replace("£º£©", "VVVV");
	}

}
