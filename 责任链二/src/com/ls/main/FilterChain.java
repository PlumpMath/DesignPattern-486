package com.ls.main;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

	List<Filter> filters = new ArrayList<>();
    private int index = 0;
	// ��ӹ���ע��˴���Ӽ���
	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;

	}
/**
 * ����Filter�ĵ���
 */
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
 		if(index == filters.size())//�ݹ鷵��
			return;
          Filter f = filters.get(index);
          index++;
			f.doFilter(request, response, chain);
		
	}
}
