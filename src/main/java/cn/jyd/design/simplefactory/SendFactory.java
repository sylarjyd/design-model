package cn.jyd.design.simplefactory;

public class SendFactory {

	public static Sender mailSender() {
		
			return new MailSender();
		
	}
	
	public static Sender smsSender(String type) {
		
			return new SmsSender();
		
	}

	public static void main(String[] args) {

		Sender sender = SendFactory.mailSender();
		sender.send();
	}
}


