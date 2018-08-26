/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.design.abstractfactory
 * Date:2018年8月26日下午1:49:01
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午1:49:01
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.design.abstractfactory;

public interface Shape {
	public void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}