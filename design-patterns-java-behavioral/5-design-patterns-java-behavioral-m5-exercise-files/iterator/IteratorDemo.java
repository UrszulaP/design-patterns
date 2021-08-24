package iterator;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		BikeRepository repo = new BikeRepository();
		
		repo.addBike("Cervelo");
		repo.addBike("Scott");
		repo.addBike("Fuji");
		
		Iterator<String> bikeIterator = repo.iterator();
		
		//while(bikeIterator.hasNext()) {
		//	System.out.println(bikeIterator.next());
		//}
		
		for (String bike : repo) {
			System.out.println(bike);
		}
	}
}

// w Javie każda kolekcja ma swój iterator - służy do iterowania po elementach, nie przez indeks

//▪ Traverse a container
//▪ Doesn’t expose underlying structure
//▪ Decouples algorithms
//▪ Sequential
//▪ Examples:
//	▪ java.util.Iterator
//	▪ java.util.Enumeration

//Independent, but fail fast (multiple iterators doesn't know about each other, they can't modify one object at once without throwing an error)
//Enumerators are fail safe (throw ConcurrentModificationException while 2 are modifying 1 object at once)

//▪ Access to Index (no acces to index, but some collections don't have it at all)
//▪ Directional (we can only go foward)
//▪ Speed / Efficiency (usually Iterator it is the most efficient, more than by index)

//• Efficient way to traverse
//• Hides algorithm
//• Simplify client
//• Foreach (if Collection has Iterator, we can use Foreach loop)


//Iterator
//▪ Interface based (client doesn't have to mantain it itself)
//▪ Algorithm is removed
//▪ No index
//▪ Concurrent modification (2 things can modify the same collection at the same time)

//For loop
//▪ Traversal in client
//▪ Exposes an index
//▪ Doesn’t change underlying object
//▪ foreach syntax
//▪ Typically slower