package com.ls.factory;

public class PlaneFactory extends Factory {

	@Override
	Moveable creat() {
		// TODO Auto-generated method stub
		return new Plane();
	}

}
