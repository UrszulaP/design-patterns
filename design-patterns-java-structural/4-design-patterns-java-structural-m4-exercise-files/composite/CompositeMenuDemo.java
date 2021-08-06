package composite;


public class CompositeMenuDemo {

	public static void main(String[] args) {
		
		Menu mainMenu = new Menu("Main", "/main");
		
		MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
		mainMenu.add(safetyMenuItem);
		
		Menu claimsSubMenu = new Menu("Claims", "/claims");
		mainMenu.add(claimsSubMenu);
		
		MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
		claimsSubMenu.add(personalClaimsMenu);
		
		System.out.println(mainMenu.toString());
	}
}

// 						Menu mainMenu
//						/			\
//	MenuItem safetyMenuItem			Menu claimsSubMenu
//											\
//										MenuItem personalClaimsMenu

// rezultat: printuje nam wszystkie elementy po kolei
// kolejność printowania: Main, Safety, Claim, Personal Claim

// używany do tree structure (jak komponenty w Angularze)
// traktuje wszystkie elementy tak samo (metoda toString()) - zarówno pojedyncze (MenuItem) jak i kompozyty (Menu)

//▪ Components represent part or whole structure
//▪ Compose objects into tree structures
//▪ Individual object treated as a Composite
//▪ Same operations applied on individual and composites
//▪ Examples:
//	▪ java.awt.Component
//	▪ JSF widgets
//	▪ RESTful service GETs

//▪ Can overly simplify system
//▪ Difficult to restrict
//▪ Implementation can possibly be costly

//• Generalizes a hierarchical structure
//• Can simplify things too much
//• Easier for clients
//• Composite != Composition (Composite - pattern that deals with hierarchical structure; Composition - one object containing another)
