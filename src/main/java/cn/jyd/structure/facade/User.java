/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.structure.facade
 * Date:2018年8月26日下午3:51:35
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午3:51:35
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.structure.facade;

/**
 * 外观模式是为了解决类与类之家的依赖关系的，像 spring 一样，可以将类和类之间的关系配
置到配置文件中，而外观模式就是将他们的关系放在一个 Facade 类中，降低了类类之间的耦
合度，该模式中没有涉及到接口.
 * ClassName: User
 * Comment:
 * Time: 2018年8月26日 下午3:55:20
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class User {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}

class CPU {

	public void startup() {
		System.out.println("cpu startup!");
	}

	public void shutdown() {
		System.out.println("cpu shutdown!");
	}
}

class Memory {

	public void startup() {
		System.out.println("memory startup!");
	}

	public void shutdown() {
		System.out.println("memory shutdown!");
	}
}

class Disk {

	public void startup() {
		System.out.println("disk startup!");
	}

	public void shutdown() {
		System.out.println("disk shutdown!");
	}
}

class Computer {
	private CPU cpu;
	private Memory memory;
	private Disk disk;

	public Computer() {
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}

	public void startup() {
		System.out.println("start the computer!");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("start computer finished!");
	}

	public void shutdown() {
		System.out.println("begin to close the computer!");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("computer closed!");
	}
}
