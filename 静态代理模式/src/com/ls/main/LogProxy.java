package com.ls.main;

public class LogProxy implements Moveable {
	private Moveable mv;

	public LogProxy(Moveable mv) {
		super();
		this.mv = mv;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("LogProxy ~~Start");
		mv.run();
		System.out.println("LogProxy ~~End");

	}

}
