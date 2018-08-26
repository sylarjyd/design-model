package cn.jyd.design.factorymethod;

public class TestFactoryMethod {
	public static void main(String[] args) {
		MailSenderFactory mailSenderFactory = new MailSenderFactory();
		Sender produce = mailSenderFactory.produce();
		produce.send();
		
		
		SmsSenderFactory smsSenderFactory = new SmsSenderFactory();
		Sender produce2 = smsSenderFactory.produce();
		produce2.send();
		
	}
}
