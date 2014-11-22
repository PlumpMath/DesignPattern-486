package com.ls.abstractfactory;

public class DefaultFactory extends AbstractFactory {

	@Override
	public Vehicle creatVehicle() {
		// TODO Auto-generated method stub
		return new Car();

	}

	@Override
	public Food creatFood() {
		// TODO Auto-generated method stub
		return new Apple();
	}

}
