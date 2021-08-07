package decorator;

public class MeatDecorator extends SandwichDecorator {  // typ: concrete Decorator

	public MeatDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	public String make() {
		return customSandwich.make() + addMeat();  // added functionality
	}

	private String addMeat() {
		return " + turkey";
	}
}
