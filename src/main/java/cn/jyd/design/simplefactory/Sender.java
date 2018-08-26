/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.design.simplefactory
 * Date:2018年8月26日下午1:02:26
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午1:02:26
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.design.simplefactory;

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
