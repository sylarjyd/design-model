/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.design.builder
 * Date:2018年8月26日下午2:44:29
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午2:44:29
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.design.builder;

public interface Item {
	public String name();

	public Packing packing();

	public float price();
}

interface Packing {
	public String pack();
}