package com.ls.main;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
	List<Filter> filters = new ArrayList<>();
//��ӹ���ע��˴���Ӽ���
	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;

	}
//�����ַ���
	public String doFilter(String s) {
		String r = s;
		for (Filter f : filters) {
			r = f.doFilter(r);
		}
		return r;
	}
}
