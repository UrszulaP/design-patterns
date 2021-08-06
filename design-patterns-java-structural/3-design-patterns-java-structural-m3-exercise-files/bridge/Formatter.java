package bridge;

import java.util.List;

public interface Formatter {  // analogiczny do Color w shape2
	String format(String header, List<Detail> details);
}
