package com.ls.factory;

public class Test {

	/**��������һϵ�в�Ʒ�Ĳ�����
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory fa = new PlaneFactory();
		Moveable mv = fa.creat();
		// Moveable mv = Car.getInstance();����
		mv.run();
	}

}
