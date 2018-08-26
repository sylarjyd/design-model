/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.relation.command
 * Date:2018年8月26日下午6:40:44
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午6:40:44
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.relation.command;
/**类之间的关系
 * 命令模式很好理解，举个例子，司令员下令让士兵去干件事情，从整个事情的角度来考虑，司
令员的作用是，发出口令，口令经过传递，传到了士兵耳朵里，士兵去执行。这个过程好在，
三者相互解耦，任何一方都不用去依赖其他人，只需要做好自己的事儿就行，司令员要的是结
果，不会去关注到底士兵是怎么实现的。
 * ClassName: Test
 * Comment:
 * Time: 2018年8月26日 下午6:45:43
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class Test {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command cmd = new MyCommand(receiver);
		Invoker invoker = new Invoker(cmd);
		invoker.action();
	}
}

interface Command {
	public void exe();
}

class MyCommand implements Command {

	private Receiver receiver;

	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void exe() {
		receiver.action();
	}
}

class Receiver {
	public void action() {
		System.out.println("command received!");
	}
}

class Invoker {

	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void action() {
		command.exe();
	}
}
