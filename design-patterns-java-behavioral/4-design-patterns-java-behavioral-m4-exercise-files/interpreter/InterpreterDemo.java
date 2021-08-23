package interpreter;

public class InterpreterDemo {

//	Example 1:

//	static Expression buildInterpreterTree() {
//		Expression terminal1 = new TerminalExpression("Lions");
//		return terminal1;
//	}
//
//	public static void main(String[] args) {
//		String context = "Lions";
//		// String context = "Tigers";
//		Expression define = buildInterpreterTree();
//		System.out.println(context + " is " + define.interpret(context));
//	}


//	Example 2:

	static Expression buildInterpreterTree() {

		Expression terminal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tigers");
		Expression terminal3 = new TerminalExpression("Bears");

		// Tigers and Bears
		Expression alternation1 = new AndExpression(terminal2, terminal3);

		//Lions or (Tigers and Bears)
		Expression alternation2 = new OrExpression(terminal1, alternation1);

		//Bears and (Lions or (Tigers and Bears))
		return new AndExpression(terminal3, alternation2);
	}

	/**
	 * main method - build the interpreter and then interpret a specific
	 * sequence
	 *
	 * @param args
	 */
	public static void main(String[] args) {

//		String context = "Lions";  // false
//		String context = "Tigers";  // false
//		String context = "Bears";  // false
//		String context = "Lions Tigers";  // false
//		String context = "Lions Bears";  // true
		String context = "Tigers Bears";  // true

		Expression define = buildInterpreterTree();

		System.out.println(context + " is " + define.interpret(context));
	}
}

// Tworzy interpreter do wyszukiwania fraz w tekście (obiektach), walidacji - eliminuje konieczność hardkodowania if-ów

//▪ Represent grammar
//▪ Interpret a sentence
//▪ Map a domain
//▪ AST
//▪ Examples:
//	▪ java.util.Pattern
//	▪ java.text.Format

//▪ Complexity
//▪ Class per rule
//▪ Use of other patterns
//▪ Adding new variant
//▪ Specific case

//▪ Access to properties
//▪ Function as methods
//▪ Adding new functionality changes every variant

//• Define a grammar
//• Rules or Validation
//• Special case pattern
//• Consider the Visitor
