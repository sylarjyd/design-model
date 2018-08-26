/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.relation.state
 * Date:2018年8月26日下午9:21:17
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午9:21:17
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.relation.state;
/**
 * 
 * 类的状态
 * 核心思想就是：当对象的状态改变时，同时改变其行为，很好理解！就拿 QQ 来说，有几种状
态，在线、隐身、忙碌等，每个状态对应不同的操作，而且你的好友也能看到你的状态，所以，
状态模式就两点：1、可以通过改变状态来获得不同的行为。2、你的好友能同时看到你的变
化。
 * ClassName: Test
 * Comment:
 * Time: 2018年8月26日 下午9:24:12
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class Test {

	public static void main(String[] args) {

		State state = new State();
		Context context = new Context(state);

		// 设置第一种状态
		state.setValue("state1");
		context.method();

		// 设置第二种状态
		state.setValue("state2");
		context.method();
	}
}

class State {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {

		this.value = value;
	}

	public void method1() {
		System.out.println("execute the first opt!");
	}

	public void method2() {
		System.out.println("execute the second opt!");
	}
}

class Context {

	private State state;

	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void method() {
		if (state.getValue().equals("state1")) {
			state.method1();
		} else if (state.getValue().equals("state2")) {
			state.method2();
		}

	}
}
