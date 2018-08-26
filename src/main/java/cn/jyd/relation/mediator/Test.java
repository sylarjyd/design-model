package cn.jyd.relation.mediator;
/**通过中间类
 * 中介者模式也是用来降低类类之间的耦合的，因为如果类类之间有依赖关系的话，不利于功能
的拓展和维护，因为只要修改一个对象，其它关联的对象都得进行修改。如果使用中介者模式，
只需关心和 Mediator 类的关系，具体类类之间的关系及调度交给 Mediator 就行，这有点像
spring 容器的作用。
 * ClassName: Test
 * Comment:
 * Time: 2018年8月26日 下午9:49:03
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class Test {

	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}

interface Mediator {
	public void createMediator();

	public void workAll();
}

class MyMediator implements Mediator {

	private User user1;
	private User user2;

	public User getUser1() {
		return user1;
	}

	public User getUser2() {
		return user2;

	}

	@Override
	public void createMediator() {
		user1 = new User1(this);
		user2 = new User2(this);
	}

	@Override
	public void workAll() {
		user1.work();
		user2.work();
	}
}

abstract class User {

	private Mediator mediator;

	public Mediator getMediator() {
		return mediator;
	}

	public User(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void work();
}

class User1 extends User {

	public User1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user1 exe!");
	}

}

class User2 extends User {

	public User2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user2 exe!");
	}
}
