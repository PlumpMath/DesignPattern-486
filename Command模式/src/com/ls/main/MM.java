package com.ls.main;

public class MM {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void doSomething(Boy b) {
		Command cm = new ShoppingCommand();
		b.addCommand(cm);
		Command cm1 = new HugCommand();
		b.addCommand(cm1);
		b.excute();
		b.unDo();
	}
}
