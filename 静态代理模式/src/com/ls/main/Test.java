package com.ls.main;

public class Test {

	/**静态代理模式实现两种方式聚合由于继承可扩展强。
	 * 代理类实现相同接口
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moveable mv = new Tank();
		Moveable tp = new TimeProxy(mv);
		Moveable lp = new LogProxy(tp);
		lp.run();
	}

}
