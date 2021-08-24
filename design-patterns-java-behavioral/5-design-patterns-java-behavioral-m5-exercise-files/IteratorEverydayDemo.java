import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorEverydayDemo {

	public static void main(String[] args) {
		//List<String> names = new ArrayList<>();
		Set<String> names = new HashSet<>();

		names.add("Bryan");
		names.add("Aaron");
		names.add("Jason");
		
		Iterator<String> namesItr = names.iterator();
		
		//for(int i = 0; i < names.size(); i++) {  // this exposes the index, doesn't use Iterator; can't use it with Set, List only (Set has no index)
		//	String name = names.get(i);
		//}
		
		//for (String name : names) {  // this uses Iterator behind the scenes
		//	System.out.println(name);
		//}
		
		while(namesItr.hasNext()) {
			String name = namesItr.next();
			System.out.println(name);
			namesItr.remove();
		}
		
		System.out.println("Names size: " + names.size());
	}
}
