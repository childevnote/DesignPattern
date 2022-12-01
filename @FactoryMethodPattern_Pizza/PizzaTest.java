
public class PizzaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza1 = store.orderPizza("cheese");
		System.out.println("--------------------");

		Pizza pizza2 = store.orderPizza("pepperoni");
		System.out.println("--------------------");

		
		System.out.println("<생성된 피자>");
		System.out.println(pizza1.getName());
		System.out.println(pizza2.getName());
	}

}
