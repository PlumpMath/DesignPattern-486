package com.ls.mian;

public class DataSorter {

	public static void sorter(Object[] a) {// ð������
		// TODO Auto-generated method stub
		for (int i = a.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				Compareble c1 = (Compareble) a[j];
				Compareble c2 = (Compareble) a[j + 1];
				if (c1.compareTo(c2) > 0)//��װ�Ƚ�ϸ��
					swap(a, j, j + 1);
			}
		}
	}

	private static void swap(Object[] a, int i, int j) {//����
		// TODO Auto-generated method stub
		Object tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void p(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}

	public static void p(Cat[] cats) {
		// TODO Auto-generated method stub
		for (int i = 0; i < cats.length; i++) {
			System.out.print(cats[i]);
		}
	}

}
