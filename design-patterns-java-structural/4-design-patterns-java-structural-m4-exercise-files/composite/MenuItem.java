package composite;


public class MenuItem extends MenuComponent {  // ten element jest typu Leaf - nie ma dzieci; ma metody od Component

	public MenuItem(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	@Override
	public String toString() {
		return print(this);
	}

	// brak add() i remove() - nie pozwala na dodawanie/usuwanie kolejnych elementów do siebie
}
