/**
 * 
 */
/**
 * @author Administrator
 *
 */
package cn.jyd.design.modelmethod;

import cn.jyd.design.modelmethod.TestModelMethod.SonClass;
/**
 * 模板方法模式
 * @author Administrator
 *
 */
public class TestModelMethod{
	
	abstract class ParentClass{
		
		public abstract void method_1();
		public abstract void method_2();
		public abstract void method_3();
		
		public final void method_4() {
			this.method_1();
			this.method_3();
			this.method_2();
		}
		
		
	}
	
	class SonClass extends ParentClass{
		@Override
		public void method_1() {
			System.out.println("TestModelMethod.ParentClass.method_1()");
		}
		
		@Override
		public void method_2() {
			System.out.println("TestModelMethod.ParentClass.method_2()");
		}
		
		@Override
		public void method_3() {
			System.out.println("TestModelMethod.SonClass.method_3()");
		}
		
	}
	

	
	public static void main(String[] args) {
		TestModelMethod testModelMethod = new TestModelMethod();
		SonClass sonClass = testModelMethod.new SonClass();
		sonClass.method_4();

	}
	
	
	
	
}