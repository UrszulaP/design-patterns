package observer;

public class PhoneClient extends Observer {

	public PhoneClient (Subject subject) {
		this.subject = subject;  // konstruktor PhoneClient dodaje subject do jego zmiennej instancyjnej
		subject.attach(this);  // i wywołuje metodę attach() w klasie implementującej Subject - dodaje się do listy observers
	}
	
	public void addMessage(String message) {
		subject.setState(message + " - sent from phone");
	}
	
	@Override
	void update() {
		System.out.println("Phone Stream: " + subject.getState());
	}
}
