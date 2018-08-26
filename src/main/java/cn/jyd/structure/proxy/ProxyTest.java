/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.structure.proxy
 * Date:2018年8月26日下午3:09:35
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午3:09:35
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.structure.proxy;

/**
 * 代理模式的应用场景：
如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：
1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。
使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
 * ClassName: ProxyTest
 * Comment:
 * Time: 2018年8月26日 下午3:48:36
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class ProxyTest {

	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}

}

interface Sourceable {
	public void method();
}

class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");
	}
}

class Proxy implements Sourceable {

	private Source source;

	public Proxy() {
		super();
		this.source = new Source();
	}

	@Override
	public void method() {
		before();
		source.method();
		atfer();
	}

	private void atfer() {
		System.out.println("after proxy!");
	}

	private void before() {
		System.out.println("before proxy!");
	}
}

