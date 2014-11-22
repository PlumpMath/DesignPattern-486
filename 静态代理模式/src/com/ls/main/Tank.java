package com.ls.main;

import java.util.Random;

public class Tank implements Moveable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(new Random().nextInt(100000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Tank Move Time:" + (end - start));
	}

}
