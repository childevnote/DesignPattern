
public class PizzaStore {

	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}

	public Pizza orderPizza(String pizza_type) {
		Pizza pizza; // 추상 클래스와 인터페이스로는 직접 인스턴스를 만들 수 없음

		pizza = factory.createPizza(pizza_type);
		// 피자 종류를 바탕으로 올바를 구상 클래스의 인스턴스를 만들고
		// pizza 인스턴스 변수에 그 인스턴스를 대입함
		// 모든 피자 클래스는 Pizza 인터페이스를 구현함
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
