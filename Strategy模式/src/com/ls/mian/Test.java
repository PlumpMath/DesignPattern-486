package com.ls.mian;

public class Test {

	/**
	 * @param args
	 * �������չ�ԣ�1.�Ƚ�ϸ�ڷ�װ2.ר�ñȽ�����չ���ֱȽ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 5, 2, 8, 4 };
		Cat[] cats = { new Cat(1, 1), new Cat(3, 3), new Cat(2, 2) };
		DataSorter.sorter(cats);
		DataSorter.p(cats);

	}

}
