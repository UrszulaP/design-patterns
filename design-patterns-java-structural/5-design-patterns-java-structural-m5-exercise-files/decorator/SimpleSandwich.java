package decorator;

public class SimpleSandwich implements Sandwich {  // typ: concrete Component

	@Override
	public String make() {
		return "Bread";
	}
}
