package com.ls.main;

public interface Filter {
	public void doFilter(Request request, Response reponse, FilterChain chain);

}
