package bean;

public class LunchOrderBeanDemo {

public static void main(String args[]) {
		
		LunchOrderBean lunchOrderBean = new LunchOrderBean();
		
		lunchOrderBean.setBread("Wheat");		// nie można zrobić łańcucha metod .set...
		lunchOrderBean.setCondiments("Lettuce");
		lunchOrderBean.setDressing("Mustard");
		lunchOrderBean.setMeat("Ham");
		
		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());	
	}
	
}
