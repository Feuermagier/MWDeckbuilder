package guice.services;

public class MockMessageService implements MessageService{

	public boolean sendMessage(String msg, String receipient) {
		return true;
	}

}
