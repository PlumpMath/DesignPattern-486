package com.ls.test;

public class SetPrice {
	private DaZhe da = new DaZheStategy1();

	public double price(Food f) {
		return da.dazhe(f.getPrice());
	}
}
