package com.ls.main;

public class Main {

	/**ʵ�������뷴��˫�����
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "��˫����<script>  , ���� ��������ܸ��˰�����";
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResposeStr("response:");
		FilterChain fc = new FilterChain();// һ�ι�����
		fc.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter());// ��ӹ���
		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new FaceFilter());//���ù���
		fc.addFilter(fc2);// ��Ϲ�������
		fc.doFilter(request, response,fc);
		System.out.println(request.getRequestStr());
		System.out.println( response.getResposeStr());
	}

}
