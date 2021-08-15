package chain;


public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		Director bryan = new Director();  // these are Handlers
		VP crystal = new VP();
		CEO jeff = new CEO();
		
		bryan.setSuccessor(crystal);
		crystal.setSuccessor(jeff);
		
		Request request = new Request(RequestType.CONFERENCE, 500);
		bryan.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 1000);
		bryan.handleRequest(request);  // crystal would also work, bryan would handle it itself - it makes sense to call the first chain class
		
		request = new Request(RequestType.PURCHASE, 2000);
		bryan.handleRequest(request);
	}
}

// wysyła request do klasy 1 -> klasa 1, jeśli spełnia warunki to obsługuje, jeśłi nie to wysyła do klasy 2 -> klasa 2 ... do klasy 3 -> ...

//▪ Decoupling of sender and receiver
//▪ Receiver contains reference to next receiver
//▪ Promotes loose coupling
//▪ No Handler - OK
//▪ Examples:
//	▪ java.util.logging.Logger#log()
//	▪ javax.servlet.Filter#doFilter()
//	▪ Spring Security Filter Chain
//
//▪ Handling/Handler guarantee
//▪ Runtime configuration risk
//▪ Chain length/performance issues
//
//• Decouples sender and receiver
//• Runtime configuration
//• Hierarchical in nature
//• Careful with large chains
