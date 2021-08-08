package flyweight;

public class FlyweightInventoryDemo {

	public static void main(String[] args) {
		InventorySystem ims = new InventorySystem();

		ims.takeOrder("Roomba", 221);
		ims.takeOrder("Bose Headphones", 361);
		ims.takeOrder("Samsung TV", 432);
		ims.takeOrder("Samsung TV", 323);
		ims.takeOrder("Roomba", 563);
		ims.takeOrder("Bose Headphones", 321);
		ims.takeOrder("Roomba", 234);
		ims.takeOrder("Samsung TV", 54);
		ims.takeOrder("Roomba", 34);
		ims.takeOrder("Bose Headphones", 365);
		ims.takeOrder("Samsung TV", 332);
		ims.takeOrder("Roomba", 456);

		ims.process();
		
		System.out.println(ims.report());  // tworzy 3 obiekty Item zamiast 12

	}
}

// flyweight - pyłek
// używany do optymalizacji RAM, np. w Inventory Management System, sklepach - żeby nie tworzyć wielu obiektów

//▪ More efficient use of memory
//▪ Large number of similar objects
//▪ Immutable
//▪ Most of the object states can be extrinsic
//▪ Examples:
//	▪ java.lang.String (String Pool)?
//		Tworząc nowy String w przypadku powtórzenia danego ciągu znaków kompilator odwoła się do obiektów klasy String zawartych w puli – czego skutkiem będzie wyższa wydajność programu.
//	▪ java.lang.Integer#valueOf(int)
//	▪ Boolean, Byte, Character, Short, Long
//
//Pattern of patterns
//Utilizes a Factory
//Encompasses Creation and Structure
//Client, Factory, Flyweight, ConcreteFlyweight
//
//▪ Complex pattern
//▪ Premature optimization
//▪ Must understand Factory
//▪ Not a graphical pattern
