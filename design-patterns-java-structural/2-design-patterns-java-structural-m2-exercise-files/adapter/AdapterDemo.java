package adapter;

import java.util.List;

public class AdapterDemo {

	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		List<Employee> employees = client.getEmployeeList();
		System.out.println(employees);  // klasy mają metody toString(), definiującą, jak się wyprintują
	}
}

// adapter - pozwala na połączenie starego kodu z nowym
// np. połączenie 2 klas o różnych polach - mapowanie jednych nazw/typów pól na drugie

//Plug adaptor
//Convert interface into another interface
//Legacy
//Translates requests
//Client, Adapter, Adaptee
//Examples:
//	▪ Arrays -> Lists
//	▪ Streams

//Client centric
//Integrate new with old
//Interface, but not required
//Adaptee can be the implementation

//Works after code is designed
//Legacy
//Retrofitted
//Provides different interface
