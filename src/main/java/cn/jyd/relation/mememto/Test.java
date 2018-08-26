/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.relation.mememto
 * Date:2018年8月26日下午9:15:28
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午9:15:28
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.relation.mememto;
/**
 * 类的状态
 * 主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象，个人觉得叫备份模式更形
象些，通俗的讲下：假设有原始类 A，A 中有各种属性，A 可以决定需要备份的属性，备忘录
类 B 是用来存储 A 的一些内部状态，类 C 呢，就是一个用来存储备忘录的，且只能存储，不
能修改等操作。
备份-恢复模式
 * ClassName: Test
 * Comment:
 * Time: 2018年8月26日 下午9:17:51
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class Test {

	public static void main(String[] args) {

		// 创建原始类
		Original origi = new Original("egg");

		// 创建备忘录
		Storage storage = new Storage(origi.createMemento());

		// 修改原始类的状态
		System.out.println("初始化状态为：" + origi.getValue());
		origi.setValue("niu");
		System.out.println("修改后的状态为：" + origi.getValue());

		// 回复原始类的状态
		origi.restoreMemento(storage.getMemento());
		System.out.println("恢复后的状态为：" + origi.getValue());
	}
}

class Original {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Original(String value) {
		this.value = value;
	}

	public Memento createMemento() {
		return new Memento(value);
	}

	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
	}
}

class Memento {

	private String value;

	public Memento(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}

class Storage {

	private Memento memento;

	public Storage(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
