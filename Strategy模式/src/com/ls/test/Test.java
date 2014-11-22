package com.ls.test;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f = new Food(1.5);
		SetPrice pri = new SetPrice();
		System.out.println("price : " + pri.price(f));
	}

}
