package memento;

import java.util.Stack;

//caretaker
public class Caretaker {

	private Stack<EmployeeMemento> employeeHistory = new Stack<>(); // can be any other data type, but stack is the most suitable
	
	public void save(Employee emp) {  // input parameter - creates EmployeeMemento from Employee and saves it to the stack
		employeeHistory.push(emp.save());
	}
	
	public void revert(Employee emp) {  // output parameter - sets Employee fields to the same as the top stack element
		emp.revert(employeeHistory.pop());
	}
}
