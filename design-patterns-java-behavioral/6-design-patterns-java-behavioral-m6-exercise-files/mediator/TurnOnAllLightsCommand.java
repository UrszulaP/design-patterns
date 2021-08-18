package mediator;

//concrete command
public class TurnOnAllLightsCommand implements Command {

	private Mediator med;
	
	public TurnOnAllLightsCommand(Mediator med) {
		this.med = med;
	}
	
	@Override
	public void execute() {
		med.turnOnAllLights();
	}
}

// in command example it was taking list of Lights and implementing the all lights on method itself, now it just uses the mediator