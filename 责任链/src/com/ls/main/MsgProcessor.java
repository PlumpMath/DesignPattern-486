package com.ls.main;

public class MsgProcessor {
	/**
	 * �ַ���������
	 */
	private String msg;
	private FilterChain fc;
//	private Filter[] f = { new HTMLFilter(), new SensitiveFilter(),
//			new FaceFilter() };// ���� ��������

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setFc(FilterChain fc) {
		this.fc = fc;
	}

	// ������
	public String process() {
//		String r = msg;
//		for (Filter f : filters) {
//			r = f.doFilter(r);
//		}
//		return r;
		return fc.doFilter(msg);
	}

}
