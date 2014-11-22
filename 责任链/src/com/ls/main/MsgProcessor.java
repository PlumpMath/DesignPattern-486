package com.ls.main;

public class MsgProcessor {
	/**
	 * 字符串处理类
	 */
	private String msg;
	private FilterChain fc;
//	private Filter[] f = { new HTMLFilter(), new SensitiveFilter(),
//			new FaceFilter() };// 处理 规则链条

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setFc(FilterChain fc) {
		this.fc = fc;
	}

	// 处理方法
	public String process() {
//		String r = msg;
//		for (Filter f : filters) {
//			r = f.doFilter(r);
//		}
//		return r;
		return fc.doFilter(msg);
	}

}
