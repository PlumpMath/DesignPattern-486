package com.ls.main;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collection al = new ArrayList();
		Collection al = new LinkedList();
		for (int i = 0; i < 15; i++) {
			al.add(new Cat(i));
		}
		System.out.println(al.size());
		Iterator it = al.getIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
