package cn.jyd.relation.interpreter;
/**
 * 一般主要应用在 OOP 开发中的编译器的开发中
 * 解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等
 * ClassName: Test
 * Comment:
 * Time: 2018年8月26日 下午9:55:10
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class Test {

	public static void main(String[] args) {

		// 计算 9+2-8 的值
		int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}

interface Expression {
	public int interpret(Context context);
}

class Plus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1() + context.getNum2();
	}
}

class Minus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1() - context.getNum2();
	}
}

class Context {

	private int num1;
	private int num2;

	public Context(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}
