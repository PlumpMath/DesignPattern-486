package com.ls.main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "��˫����<script>  , ���� ��������ܸ��˰�����";
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);//�����޸��ַ�
		FilterChain fc = new FilterChain();//һ�ι�����
		fc.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter());//��ӹ���
		FilterChain fc2 =new FilterChain();
		fc2.addFilter(new FaceFilter());
		fc.addFilter(fc2);//��Ϲ�������
		mp.setFc(fc);
		System.out.println(mp.process());
	}

}
