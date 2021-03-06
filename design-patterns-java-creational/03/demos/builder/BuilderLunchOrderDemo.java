package builder;

public class BuilderLunchOrderDemo {

	public static void main(String args[]) {
		
		LunchOrder.Builder builder = new LunchOrder.Builder();
		
		builder.bread("Wheat").dressing("Mayo").meat("Turkey");		// można zrobić łańcuch metod
		
		LunchOrder lunchOrder = builder.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());	
	}
}

// 3 metoda - wzorzec builder
// jest lepsza od bean, bo można ustawiać metody set w łańcuchu
// jest niemutowalna po stworzeniu - nie da się edytować pól
