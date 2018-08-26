package cn.jyd.relation.visitor;
/**通过中间类
 * 访问者模式把数据结构和作用于结构上的操作解耦合，使得操作集合可相对自由地演化。访问
者模式适用于数据结构相对稳定算法又易变化的系统。因为访问者模式使得算法操作增加变得
容易。若系统数据结构对象易于变化，经常有新的数据对象增加进来，则不适合使用访问者模
式。访问者模式的优点是增加操作很容易，因为增加操作意味着增加新的访问者。访问者模式
将有关行为集中到一个访问者对象中，其改变不影响系统数据结构。其缺点就是增加新的数据
结构很困难。

该模式适用场景：如果我们想为一个现有的类增加新功能，不得不考虑几个事情：1、新功能
会不会与现有功能出现兼容性问题？2、以后会不会再需要添加？3、如果类不允许修改代码
怎么办？面对这些问题，最好的解决方法就是使用访问者模式，访问者模式适用于数据结构相
对稳定的系统，把数据结构和算法解耦
 * ClassName: Test
 * Comment:
 * Time: 2018年8月26日 下午9:40:14
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class Test {

	public static void main(String[] args) {

		Visitor visitor = new MyVisitor();
		Subject sub = new MySubject();
		sub.accept(visitor);
	}
}

interface Visitor {
	public void visit(Subject sub);
}

class MyVisitor implements Visitor {

	@Override
	public void visit(Subject sub) {
		System.out.println("visit the subject：" + sub.getSubject());
	}
}

interface Subject {
	public void accept(Visitor visitor);

	public String getSubject();
}

class MySubject implements Subject {

	@Override

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		return "love";
	}
}
