package cn.jyd.structure.adapter;
/**
 * 类的适配器模式：当希望将 一个类转换成满足 另一个新接口的类时，可以使用类的适配器模式，
创建一个新类，继承原有的类，实现新的接口即可。
对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个
Wrapper 类，持有原类的一个实例，在 Wrapper 类的方法中，调用实例的方法就行。
接口的适配器模式：当不希望实现一个接口中所有的方法时，可以创建一个抽象类 Wrapper，
实现所有方法，我们写别的类的时候，继承抽象类即可。
 * ClassName: AdapterTest
 * Comment:
 * Time: 2018年8月26日 下午3:36:53
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class AdapterTest {

	public static void main(String[] args) {
		
		/**
		 * 类的适配器
		 */
		Targetable target = new Adapter();
		target.method1();
		target.method2();
		/**
		 * 对象的适配器
		 */
		Source source =  new Source();
		Targetable target2 =  new Wrapper(source);
		target2.method1();
		target2.method2();
		
		/**
		 * 接口的适配器
		 * 
		 */
		
		  Sourceable source1 =  new SourceSub1();
		  Sourceable source2 =  new SourceSub2();
		 
		  source1.method1();
		  source1.method2();
		  source2.method1();
		  source2.method2();
	}
}