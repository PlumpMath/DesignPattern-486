package com.ls.factory;

public class Car implements Moveable {


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("汽车来了！！");
	}

	// 单例模式,静态工厂的实现
//	static Car car = new Car();
//	private Car() {
//	};
//
//	public static Car getInstance() {
//		return car;
//	}

}
