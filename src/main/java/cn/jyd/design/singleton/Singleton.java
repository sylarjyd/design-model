/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.design.singleton
 * Date:2018年8月24日下午11:33:48
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月24日 下午11:33:48
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.design.singleton;

/**
 * 
 * ClassName: Singleton Comment:饿汉式 Time: 2018年8月24日 下午11:39:14 Author:localhost
 * 
 * @Version
 * @Sylar JDK 1.8
 */
public class Singleton {

	public final static Singleton SINGLETON = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return SINGLETON;
	}

}

class SingletonSon {

	public static SingletonSon SINGLETONSON = null;

	private SingletonSon() {

	}

	public static SingletonSon getSingletonSon() {
		if (null != SINGLETONSON)
			return SINGLETONSON;
		synchronized (SingletonSon.class) {
			if (null == SINGLETONSON)
				SINGLETONSON = new SingletonSon();
		}
		return SINGLETONSON;
	}

}

class SingletonS {

	private SingletonS() {

	}

	private static class SingletonFactory {
		private static SingletonS instance = new SingletonS();
	}

	public static SingletonS getInstance() {
		return SingletonFactory.instance;
	}

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve() {
		return getInstance();
	}
}
