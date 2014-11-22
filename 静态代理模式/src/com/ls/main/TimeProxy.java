package com.ls.main;

public class TimeProxy implements Moveable {
	private Moveable mv;

	public TimeProxy(Moveable mv) {
		super();
		this.mv = mv;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("TimeProxy ~~Start");
		mv.run();
		System.out.println("TimeProxy ~~End");
	}

}
