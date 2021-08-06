package abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);  // od argumentu zależy wybór rodzaju factory (Amex/Visa)
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);  // używa fabryki do stworzenia docelowego obiektu (karty)
		System.out.println(card.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println(card2.getClass());
	}

}

// abstract factory - fabryka fabryk

//Factory of Factories
//Factory of related objects
//Common Interface - tu używamy abstract class, ale może być interfejs
//Defer to Subclasses
//Examples:
//	DocumentBuilder
//	Frameworks - używany we frameworkach

//Groups Factories together
//Factory is responsible for lifecycle
//Common Interface
//Concrete Classes
//Parameterized create method
//Composition