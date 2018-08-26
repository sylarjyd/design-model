package cn.jyd.structure.adapter;
/**
 * 对象的适配器
 * ClassName: Wrapper
 * Comment:
 * Time: 2018年8月26日 下午3:30:26
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class Wrapper implements Targetable {

	private Source source;

	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

	@Override
	public void method1() {
		source.method1();
	}
}