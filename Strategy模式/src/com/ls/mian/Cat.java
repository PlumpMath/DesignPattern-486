package com.ls.mian;

public class Cat implements Compareble {
	private Comparator comparator = new CatHeightComparator();

	public Comparator getComparator() {
		return comparator;
	}

	public void setComparator(Comparator comparator) {
		this.comparator = comparator;
	}

	public Cat(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	private int height;

	@Override
	public int compareTo(Object o) {// 调用专用比较器比较大小，实现可扩展性
		return comparator.compare(this, o);
	}

	@Override
	public String toString() {
		return "CatHeight" + this.getHeight() + "Weight" + this.getWeight()+"  ";
	}

}
