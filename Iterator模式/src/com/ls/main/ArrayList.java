package com.ls.main;

public class ArrayList implements Collection {
	private Object[] objects = new Object[10];
	private int index = 0;

	public void add(Object object) {
		if (index == objects.length) {
			Object[] objects2 = new Object[objects.length * 2];
			System.arraycopy(objects, 0, objects2, 0, objects.length);// 将数组容量复制到另一个
			objects = objects2;
		}
		objects[index] = object;
		index++;
	}

	public int size() {
		return index;
	}

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new Iterator() {
			private int currentIndex;

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				Object o = objects[currentIndex];
				currentIndex++;
				return o;
			}

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				if (currentIndex == index)
					return false;
				else
					return true;
			}
		};
	}
}
