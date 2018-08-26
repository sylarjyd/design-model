/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.design.strategy
 * Date:2018年8月24日下午11:13:11
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月24日 下午11:13:11
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.design.strategy;

public interface Strategy{
	
	public abstract void operateNum(int a,int b);
	
}

class OperateClass{
	private Strategy strategy;

	public OperateClass(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void operateNum(int a,int b) {
		strategy.operateNum(a, b);
	}
	
}


class StrategyA implements Strategy{

	@Override
	public void operateNum(int a, int b) {
		// TODO Auto-generated method stub
		System.err.println(a+b);
	}
	
}

class StrategyB implements Strategy{

	@Override
	public void operateNum(int a, int b) {
		// TODO Auto-generated method stub
		System.err.println(a-b);
	}
	
}

class StrategyC implements Strategy{

	@Override
	public void operateNum(int a, int b) {
		// TODO Auto-generated method stub
		System.err.println(a/b);
	}
	
}

class StrategyD implements Strategy{

	@Override
	public void operateNum(int a, int b) {
		// TODO Auto-generated method stub
		System.err.println(a*b);
	}
	
}

