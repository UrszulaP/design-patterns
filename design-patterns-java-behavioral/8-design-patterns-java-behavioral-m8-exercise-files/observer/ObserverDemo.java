package observer;

public class ObserverDemo {

	public static void main(String args[]) {
		Subject subject = new MessageStream();
		
		PhoneClient phoneClient = new PhoneClient(subject);  // konstruktor PhoneClient wywołuje metodę attach() w klasie implementującej Subject - dodaje się do listy observers
		TabletClient tabletClient = new TabletClient(subject);
		
		phoneClient.addMessage("Here is a new message!");  // nie wzywa bezpośrednio phoneClient.update() Observera, tylko przez kontrakt Observer-Subject
		tabletClient.addMessage("Another new message!");
	}
	
}

// obiekty phoneClient i tabletClient nie wiedzą nic o sobie, komunikują się przez Subject - w tym przykładzie
// w przykładzie ObserverEverydayDemo wiadomości można wysyłać tylko z kodu klienta, obiekty nie mogą

// output:
//Phone Stream: Here is a new message! - sent from phone
//Tablet Stream: Here is a new message! - sent from phone
//Phone Stream: Another new message! - sent from tablet
//Tablet Stream: Another new message! - sent from tablet

// phoneClient wysyła wiadomość do Subject, Subject wysyła do swoich Observerów - phoneClient i tabletClient odbierają wiadomość
// tabletClient wysyła wiadomość...

//One to Many - one Subject to many Observers
//▪ Decoupled
//▪ Event Handling
//▪ Pub/Sub				- Observer - used synchronously; Publisher/Subscriber - used async
//▪ M-V-C
//▪ Examples:
//	▪ java.util.Observer
//	▪ java.util.EventListener
//	▪ javax.jms.Topic

//▪ Unexpected updates
//▪ Large sized consequences
//▪ What changed
//▪ Debugging difficult
