package bridge;

public class BridgeDemo {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("John Wick");
		movie.setRuntime("2:15");
		movie.setYear("2014");
		
		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);
		
		String printedMaterial = moviePrinter.print(printFormatter);
		System.out.println(printedMaterial);
		
		Formatter htmlFormatter = new HtmlFormatter();
		
		String htmlMaterial = moviePrinter.print(htmlFormatter);
		System.out.println(htmlMaterial);
	}

}

// builder - robi to (Printer) w taki sposób (Formatter)
// Printer i Formatter są niezależne od siebie, nie wiedzą nic o sobie nawzajem - decoupled

//▪ Decouple Abstraction and implementation
//▪ Encapsulation, Composition, Inheritance
//▪ Changes in Abstraction won’t affect client
//▪ Details won’t be right
//▪ Examples:
//	▪ Driver
//	▪ JDBC

//▪ Designed upfront
//▪ Abstraction and implementation vary
//▪ Built in advance
//▪ Complex