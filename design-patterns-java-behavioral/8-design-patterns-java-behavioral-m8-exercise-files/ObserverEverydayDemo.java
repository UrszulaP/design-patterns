import java.util.Observable;
import java.util.Observer;

public class ObserverEverydayDemo {

	public static void main(String args[]) {
		TwitterStream messageStream = new TwitterStream();  // Observable - topic
		
		Client client1 = new Client("Bryan");  // Observer
		Client client2 = new Client("Mark");
		
		messageStream.addObserver(client1);
		messageStream.addObserver(client2);
		
		messageStream.someoneTweeted();
	}
}

// concrete subject
class TwitterStream extends Observable {

	public void someoneTweeted() {
		setChanged();  // musi być przed notifyObservers() - powiadamia Observers, że zmienił się stan ?
		notifyObservers();
	}
}

//concrete observer
class Client implements Observer {
	private String name;

	Client(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Update " + name + "'s stream, someone tweeted something.");
	}
}

// in java.util.Observable/er we don't have a reference to the subject inside the Observer
// w przykładzie ObserverEverydayDemo wiadomości można wysyłać tylko z kodu klienta, obiekty nie mogą (tak jak w ObserverDemo)