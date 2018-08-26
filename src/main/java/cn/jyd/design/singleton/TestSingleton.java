package cn.jyd.design.singleton;

public class TestSingleton {

	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Singleton.SINGLETON.hashCode());
			
		}
		for (int i = 0; i < 10; i++) {
			
			System.out.println(SingletonSon.getSingletonSon().hashCode());
		}
		
		for (int i = 0; i < 10; i++) {
			new Thread( new Runnable() {
				public void run() {
					while(true) {
						System.out.println(Thread.currentThread().getName()+"--------------"+
								SingletonSon.getSingletonSon().hashCode());
					}
				}
			}).start();
			
		}
		
		
		
	}
}
