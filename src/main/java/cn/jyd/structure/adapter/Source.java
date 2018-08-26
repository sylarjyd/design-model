/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.structure.adapter
 * Date:2018年8月26日下午3:07:35
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午3:07:35
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.structure.adapter;
/**
 * 
 * ClassName: Source
 * Comment:类的适配器
 * Time: 2018年8月26日 下午3:23:22
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class Source {

	public void method1() {
		System.out.println("this is original method!");
	}
}

interface Targetable {

	/* 与原类中的方法相同 */
	public void method1();

	/* 新类的方法 */
	public void method2();
}

class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}
}