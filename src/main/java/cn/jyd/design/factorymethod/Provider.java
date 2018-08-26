package cn.jyd.design.factorymethod;

public interface Provider {
	public Sender produce();
}

class MailSenderFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}
	
}

class SmsSenderFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}
	
}