package com.ls.main;

public class Test {

	/**��̬����ģʽʵ�����ַ�ʽ�ۺ����ڼ̳п���չǿ��
	 * ������ʵ����ͬ�ӿ�
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moveable mv = new Tank();
		Moveable tp = new TimeProxy(mv);
		Moveable lp = new LogProxy(tp);
		lp.run();
	}

}
