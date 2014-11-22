package com.ls.main;

public class Main {

	/**实现请求与反馈双向过滤
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "李双：）<script>  , 敏感 。。今天很高兴啊！！";
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResposeStr("response:");
		FilterChain fc = new FilterChain();// 一段规则链
		fc.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter());// 添加规则
		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new FaceFilter());//调用过滤
		fc.addFilter(fc2);// 组合规则链条
		fc.doFilter(request, response,fc);
		System.out.println(request.getRequestStr());
		System.out.println( response.getResposeStr());
	}

}
