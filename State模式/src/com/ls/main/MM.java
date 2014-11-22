package com.ls.main;

public class MM {
	private String name;
	private State state = new HappyState();//×´Ì¬¿ØÖÆ

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void cry() {
		state.cry();

	}

	public void smile() {
		state.smile();
	}
}
