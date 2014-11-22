package com.ls.main;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

	List<Filter> filters = new ArrayList<>();
    private int index = 0;
	// 添加规则，注意此处添加技巧
	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;

	}
/**
 * 控制Filter的调用
 */
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
 		if(index == filters.size())//递归返回
			return;
          Filter f = filters.get(index);
          index++;
			f.doFilter(request, response, chain);
		
	}
}
