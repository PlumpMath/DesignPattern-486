package com.ls.main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "李双：）<script>  , 敏感 。。今天很高兴啊！！";
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);//传入修改字符
		FilterChain fc = new FilterChain();//一段规则链
		fc.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter());//添加规则
		FilterChain fc2 =new FilterChain();
		fc2.addFilter(new FaceFilter());
		fc.addFilter(fc2);//组合规则链条
		mp.setFc(fc);
		System.out.println(mp.process());
	}

}
