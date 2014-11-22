package com.ls.mian;

public class Test {

	/**
	 * @param args
	 * 两层可扩展性：1.比较细节封装2.专用比较器扩展多种比较
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 5, 2, 8, 4 };
		Cat[] cats = { new Cat(1, 1), new Cat(3, 3), new Cat(2, 2) };
		DataSorter.sorter(cats);
		DataSorter.p(cats);

	}

}
