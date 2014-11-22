package com.ls.factory;

public class Test {

	/**不适用于一系列产品的产生。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory fa = new PlaneFactory();
		Moveable mv = fa.creat();
		// Moveable mv = Car.getInstance();单例
		mv.run();
	}

}
