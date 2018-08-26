/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.structure.bridge
 * Date:2018年8月26日下午3:59:00
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午3:59:00
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.structure.bridge;
/**
 * 桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。桥接的用意是： 将抽象
化与实现化解耦，使得二者可以独立变化，像我们常用的 JDBC 桥 DriverManager 一样，JDBC
进行连接数据库的时候，在各个数据库之间进行切换，基本不需要动太多的代码，甚至丝毫不
用动，原因就是 JDBC 提供统一接口，每个数据库提供各自的实现，用一个叫做数据库驱动
的程序来桥接就行了
 * ClassName: BridgeTest
 * Comment:
 * Time: 2018年8月26日 下午4:02:35
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class BridgeTest {

	public static void main(String[] args) {

		Bridge bridge = new MyBridge();

		/* 调用第一个对象 */
		Sourceable source1 = new SourceSub1();
		bridge.setSource(source1);
		bridge.method();

		/* 调用第二个对象 */
		Sourceable source2 = new SourceSub2();
		bridge.setSource(source2);
		bridge.method();
	}
}

interface Sourceable {
	public void method();
}

class SourceSub1 implements Sourceable {

	@Override
	public void method() {
		System.out.println("this is the first sub!");
	}
}

class SourceSub2 implements Sourceable {

	@Override
	public void method() {
		System.out.println("this is the second sub!");
	}
}

abstract class Bridge {
	private Sourceable source;

	public void method() {
		source.method();
	}

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}
}

class MyBridge extends Bridge {
	public void method() {
		getSource().method();
	}
}
