package prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Creational Patterns in Java");
		
		System.out.println(movie);
		System.out.println(movie.getRuntime());  // "2 hours" - to pole istnieje, pomimo castowania Movie -> Item -> Movie - czytaj niżej
		System.out.println(movie.getTitle());  // "Creational Patterns in Java" - można nadpisywać pola
		System.out.println(movie.getUrl());  // null - brak domyślnego
		// Reference variables are different; the reference variable only refers to an object but doesn’t contain the object itself.
		// When we do casting, we change the type of the remote control but don’t change the object itself.
		
		Movie anotherMovie = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Gang of Four");
		
		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getUrl());
	}

}

// wzorzec prototyp pozwala na szybkie tworzenie obiektów z domyślnymi wartościami pól
//Avoids keyword “new”
//Although a copy, each instance unique
//Costly construction not handled by client
//Can still utilize parameters for construction
//Can help with performance issues
//Avoids subclassing
