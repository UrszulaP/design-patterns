package facade;

import java.util.List;

public class FacadeJdbcDemo {

	public static void main (String args []) {
		
		JdbcFacade jdbcFacade = new JdbcFacade();
		
		jdbcFacade.createTable();
		System.out.println("Table created.");
		
		jdbcFacade.insertIntoTable();
		System.out.println("Record inserted.");
		
		List<Address> addresses = jdbcFacade.getAddresses();
		
		for (Address address : addresses) {
			System.out.println(address.getId() + " " + address.getStreetName() + " " + address.getCity());
		}
	}
}

// facade - provides simplified interface of complex or difficult to use systems (poorly designed APIs)
// upraszcza używanie api - porównanie z JdbcDemo

//▪ Make an API easier to use
//▪ Reduce dependencies on outside code
//▪ Simplify the interface or client usage
//▪ Usually a refactoring pattern
//▪ Examples:
//	▪ java.net.URL
//	▪ javax.faces.context.FacesContext
//
//• Simplifies Client Interface
//• Easy Pattern to implement
//• Refactoring Pattern
