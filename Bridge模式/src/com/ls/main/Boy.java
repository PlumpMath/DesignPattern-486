package com.ls.main;

public class Boy {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void purse(MM mm) {
		//ʵ�փɂ�ά�ȶ���֮����������
		giveGift(mm, new WarmGift(new Ring()));
	}

	private void giveGift(MM mm, WarmGift warmGift) {
		// TODO Auto-generated method stub

	}
}
