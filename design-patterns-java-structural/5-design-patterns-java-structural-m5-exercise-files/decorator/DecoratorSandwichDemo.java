package decorator;

public class DecoratorSandwichDemo {

	public static void main(String args[]) {
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));  // dekoratorów można używać łańcuchowo
		
		System.out.println(sandwich.make());
	}
}

// dekorator pozwala na dodanie nowych funkcjonalności, bez zmieniania danej klasy

// uses inheritance; adding functionality through composition (one object containing another)
// rezultat: "Bread + turkey + mustard"
// decorator może przyjąć zarówno component (Sandwitch) jak i inny decorator

// minusy: tworzymy nową klasę dla każdej funkcjonalności
// plus: tworzymy dekorator, a nie child classy, nie mieszam w hierarchii

//▪ Also called a wrapper
//▪ Add behavior without affecting others
//▪ More than just inheritance
//▪ Single Responsibility Principle
//▪ Compose behavior dynamically
//▪ Examples:
//	▪ java.io.InputStream
//	▪ java.util.Collections#checkedList
//	▪ UI components
//
//Inheritance based
//Utilizes composition and inheritance (is-a, has-a)
//Alternative to subclassing
//Constructor requires instance from hierarchy
//
//• Original object can stay the same
//• Unique way to add functionality
//• Confused with inheritance
//• Can be more complex for clients