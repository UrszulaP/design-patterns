package composite;

import java.util.Iterator;

public class Menu extends MenuComponent {  // ten element jest typu Composite - posiada dzieci; ma metody od Component oraz metody do zarządzania swoimi dziećmi
	
	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	@Override
	public MenuComponent add(MenuComponent menuComponent) {  // pozwala na dodawanie/usuwanie nowych elementów do siebie
		menuComponents.add(menuComponent);
		return menuComponent;
	}
	
	@Override
	public MenuComponent remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
		return menuComponent;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(); //builder pattern
		
		builder.append(print(this));
		
		Iterator<MenuComponent> itr = menuComponents.iterator();
		while(itr.hasNext()) {  // iteruje po swoich dzieciach (elementach) i odpala tą samą metodę
			MenuComponent menuComponent = itr.next();
			builder.append(menuComponent.toString());
		}
		
		return builder.toString();
	}
}
