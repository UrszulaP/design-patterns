package factory;

public class FactoryDemo {

	public static void main(String[] args) {
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		
		System.out.println(site.getPages());
		
		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		
		System.out.println(site.getPages());
	}

}

// wzorzec factory - do tworzenia obiektów danego typu (np. Calendar - typ kalendarza definiuje pola jakie on ma)

//Doesn’t expose instantiation logic
//Defer to subclasses
//Common interface
//Specified by architecture, implemented by user
//Examples:
//	▪ Calendar
//	▪ ResourceBundle
//	▪ NumberFormat

//Factory is responsible for lifecycle
//Common Interface
//Concrete Classes
//Parameterized create method