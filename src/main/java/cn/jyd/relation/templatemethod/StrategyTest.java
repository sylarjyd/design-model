/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.relation.templatemethod
 * Date:2018年8月26日下午4:38:14
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午4:38:14
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.relation.templatemethod;
/**
 * 父类与子类关系
 * 解释一下模板方法模式，就是指：一个抽象类中，有一个主方法，再定义 1...n 个方法，可以
是抽象的，也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，通过调用抽象
类，实现对子类的调用
 * ClassName: StrategyTest
 * Comment:
 * Time: 2018年8月26日 下午4:53:11
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class StrategyTest {

	public static void main(String[] args) {
		String exp = "8+8";
		AbstractCalculator cal = new Plus();
		int result = cal.calculate(exp, "\\+");

		System.out.println(result);
	}
}

abstract class AbstractCalculator {

	/* 主方法，实现对本类其它方法的调用  最好申明为final 不可重写*/
	public final int calculate(String exp, String opt) {
		int array[] = split(exp, opt);
		return calculate(array[0], array[1]);
	}

	/* 被子类重写的方法 */
	abstract public int calculate(int num1, int num2);

	public int[] split(String exp, String opt) {
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}

class Plus extends AbstractCalculator {

	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}
}
