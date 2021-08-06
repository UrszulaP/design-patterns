package shape2;

public abstract class Shape {  // abstract class, nie interface, żeby zdefiniować konstruktor

	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor();
}
