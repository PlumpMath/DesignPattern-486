package com.ls.abstractfactory;

public class Test {

	/**�����ڲ���һϵ�в�ͬ���͵Ķ���
	 * �������ڲ������µĲ�Ʒ����
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory fa = new MagicFactory();
		Vehicle mv = fa.creatVehicle();
		Food fd = fa.creatFood();
		mv.run();
		fd.name();
	}

}
