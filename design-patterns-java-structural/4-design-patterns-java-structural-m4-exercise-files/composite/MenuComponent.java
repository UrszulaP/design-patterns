package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {  // ten element jest typu Component - interfejs dla elementów (bez dzieci i Composite z dziećmi)
	
	String name;
	String url;
	List<MenuComponent> menuComponents = new ArrayList<>();
	
	public MenuComponent add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature not implemented at this level");  // w razie gdybyśmy chcieli stworzyć nowy typ menu, który nie pozwala na .add() lub .remove()
	}

	public MenuComponent remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}
	
	public String getName() {
		return name;
	}
	
	public String getUrl() {
		return url;
	}	
	
	public abstract String toString();
	
	String print(MenuComponent menuComponent) {
		StringBuilder builder = new StringBuilder(name);
		builder.append(": ");
		builder.append(url);
		builder.append("\n");
		return builder.toString();
	}
}
