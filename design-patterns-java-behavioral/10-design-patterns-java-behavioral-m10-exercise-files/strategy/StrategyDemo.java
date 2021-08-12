package strategy;

public class StrategyDemo {

	public static void main(String args[]) {
		CreditCard amexCard = new CreditCard(new AmexStrategy());
		amexCard.setNumber("379185883464283");
		amexCard.setDate("04/2020");
		amexCard.setCvv("123");
		System.out.println("Is Amex valid: " + amexCard.isValid());
		
		CreditCard amexCard2 = new CreditCard(new AmexStrategy());
		amexCard2.setNumber("379185883464282");
		amexCard2.setDate("04/2017");
		amexCard2.setCvv("234");
		System.out.println("Is Amex valid: " + amexCard2.isValid());
		
		CreditCard visaCard = new CreditCard(new VisaStrategy());
		visaCard.setNumber("4539589763663402");
		visaCard.setDate("05/2018");
		visaCard.setCvv("324");
		System.out.println("Is Visa valid: " + visaCard.isValid());
	}
}

// strategię przekazuje się do konstruktora obiektu i w nim wywołuje metodę strategii

//▪ Eliminate conditional statements
//▪ Behavior encapsulated in classes
//▪ Difficult to add new strategies
//▪ Client aware of strategies
//▪ Client chooses strategy
//▪ Examples:
//	▪ java.util.Comparator - do porównywania w sortowaniu kolekcji

//Abstract base class
//Concrete class per strategy
//Removes if/else conditionals
//Strategies are independent
//Context, Strategy, ConcreteStrategy

//▪ Client aware of Strategies
//▪ Increased number of classes

//▪ Interface based
//▪ Algorithms are Independent
//▪ Class per Algorithm

//• Externalizes algorithms
//• Client knows different Strategies
//• Class per Strategy
//• Reduces conditional statements
