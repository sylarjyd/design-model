/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.structure.decorator
 * Date:2018年8月26日下午3:38:32
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午3:38:32
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.structure.decorator;
/**
 * 装饰器模式的应用场景：
1、需要扩展一个类的功能。
2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是
静态的，不能动态增删。）
缺点：产生过多相似的对象，不易排错！
 * ClassName: DecoratorTest
 * Comment:
 * Time: 2018年8月26日 下午3:43:57
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
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

class Decorator implements Sourceable {

	private Sourceable source;

	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");

	}
}