package com.ls.main;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
	List<Filter> filters = new ArrayList<>();
//添加规则，注意此处添加技巧
	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;

	}
//处理字符串
	public String doFilter(String s) {
		String r = s;
		for (Filter f : filters) {
			r = f.doFilter(r);
		}
		return r;
	}
}
