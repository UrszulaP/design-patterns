package decorator;

public class DressingDecorator extends SandwichDecorator {  // typ: concrete Decorator

	public DressingDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	public String make() {
		return customSandwich.make() + addDressing();  // added functionality
	}
	
	private String addDressing() {
		return " + mustard";
	}
	
}
