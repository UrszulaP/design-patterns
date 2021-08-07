package decorator;

// typ: Decorator, baza dla concrete Decorators
// również implementuje Component interface - decorator should be treated as objects, so we don't have to create various
// implementations of the sandwich (SimpleSandwith with Meat, SS with Cheese...)
public abstract class SandwichDecorator implements Sandwich {

	// can be a concrete class or an instance of another decorator - można używać łańcucha dekoratorów
	// ponieważ Decorator i concrete Component implementują wspólny interfejs - Component (Sandwitch)
	protected Sandwich customSandwich;

	public SandwichDecorator(Sandwich customSandwich) {
		this.customSandwich = customSandwich;
	}

	public String make() {
		return customSandwich.make();
	}
	
}
