package mediator;

public class MediatorDemo {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		Light bedroomLight = new Light("Bedroom");
		Light kitchenLight = new Light("Kitchen");
		
		mediator.registerLight(bedroomLight);
		mediator.registerLight(kitchenLight);
		
		Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
		
		turnOnAllLightsCommand.execute();
		
		Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
		
		turnOffAllLightsCommand.execute();
	}

}

// mediator allows classes to work independently, without having to communicate with each other

//▪ Loose coupling
//▪ Well-defined, but complex
//▪ Reusable components
//▪ Hub / Router
//▪ Examples:
//	▪ java.util.Timer
//	▪ java.lang.reflect.Method#invoke()

//Minimizes inheritance
//Mediator knows about colleagues

//• Loose coupling
//• Simplified communication
//• Mediator complexity
//• Use with Command
