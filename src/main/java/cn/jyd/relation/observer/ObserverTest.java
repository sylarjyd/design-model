/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.relation.observer
 * Date:2018年8月26日下午4:59:21
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午4:59:21
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.relation.observer;

import java.util.Enumeration;
import java.util.Vector;
/**
 * 类之间的关系
 * 包括这个模式在内的接下来的四个模式，都是类和类之间的关系，不涉及到继承，
 * 观察者模式很好理解，类似于邮件订阅和 RSS 订阅，
当我们浏览一些博客或 wiki 时，经常会看到 RSS 图标，就这的意思是，当你订阅了该文章，
如果后续有更新，会及时通知你。其实，简单来讲就一句话：当一个对象变化时，其它依赖该
对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系。
 * ClassName: ObserverTest
 * Comment:
 * Time: 2018年8月26日 下午5:03:34
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class ObserverTest {

	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());

		sub.operation();
	}

}

interface Observer {
	public void update();
}

class Observer1 implements Observer {

	@Override
	public void update() {
		System.out.println("observer1 has received!");
	}
}

class Observer2 implements Observer {

	@Override
	public void update() {
		System.out.println("observer2 has received!");
	}

}

interface Subject {

	/* 增加观察者 */
	public void add(Observer observer);

	/* 删除观察者 */
	public void del(Observer observer);

	/* 通知所有的观察者 */
	public void notifyObservers();

	/* 自身的操作 */

	public void operation();
}

abstract class AbstractSubject implements Subject {

	private Vector<Observer> vector = new Vector<Observer>();

	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumo = vector.elements();
		while (enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
	}
}

class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();
	}

}
