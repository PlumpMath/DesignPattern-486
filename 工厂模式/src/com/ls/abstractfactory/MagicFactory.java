package com.ls.abstractfactory;

public class MagicFactory extends AbstractFactory {

	@Override
	public Vehicle creatVehicle() {
		// TODO Auto-generated method stub
		return new MagicCar();
	}

	@Override
	public Food creatFood() {
		// TODO Auto-generated method stub
		return new MagicApple();
	}

}
