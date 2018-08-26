/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.design.factorymethod
 * Date:2018年8月26日下午1:28:31
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午1:28:31
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.design.factorymethod;

public interface Sender{
	public void send();
}

class MailSender implements Sender{

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("MailSender.send()");
	}
	
}
class SmsSender implements Sender{

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("SmsSender.send()");
	}
	
}
