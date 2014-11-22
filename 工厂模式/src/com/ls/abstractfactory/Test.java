package com.ls.abstractfactory;

public class Test {

	/**适用于产生一系列不同类型的对象
	 * 不适用于产生于新的产品类型
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
