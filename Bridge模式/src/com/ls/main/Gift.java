package com.ls.main;

public class Gift {
	//Gift属性父类
	private GiftImpl gi;//具体Gift引用类型，实现组合
	

	public GiftImpl getGi() {
		return gi;
	}

	public void setGi(GiftImpl gi) {
		this.gi = gi;
	}

}
