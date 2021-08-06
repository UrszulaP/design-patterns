package bridge;

import java.util.List;

public abstract class Printer {  // analogicznie do Shape w shape2

	public String print(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}
	
	abstract protected List<Detail> getDetails();
	
	abstract protected String getHeader();
}
