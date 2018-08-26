package cn.jyd.structure.adapter;
/**
 * 
 * ClassName: Sourceable
 * Comment:接口的适配器
 * Time: 2018年8月26日 下午3:35:37
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public interface Sourceable {

	public void method1();

	public void method2();

}

abstract class Wrapper2 implements Sourceable {

	public void method1() {
	}

	public void method2() {
	}
}

class SourceSub1 extends Wrapper2 {
	public void method1() {
		System.out.println("the sourceable interface's first Sub1!");
	}

}

class SourceSub2 extends Wrapper2 {
	public void method2() {
		System.out.println("the sourceable interface's second Sub2!");
	}
}
