/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.design.prototype
 * Date:2018年8月26日下午2:55:35
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午2:55:35
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.design.prototype;
/**
 * 
 * ClassName: Prototype
 * Comment:浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原
对象所指向的。
 * Time: 2018年8月26日 下午2:58:07
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class Prototype implements Cloneable {

	public Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}
}