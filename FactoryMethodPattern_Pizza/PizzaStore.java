
public class PizzaStore {
	
	Pizza orderPizza(String pizza_type) {
		Pizza pizza; // 추상 클래스와 인터페이스로는 직접 인스턴스를 만들 수 없음
		
		
		//피자 종류를 바탕으로 올바를 구상 클래스의 인스턴스를 만들고
		//pizza 인스턴스 변수에 그 인스턴스를 대입함
		//모든 피자 클래스는 Pizza 인터페이스를 구현함
		
		if(pizza_type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if(pizza_type.equals("greek")) {
			pizza = new GreekPizza();
		} else if(pizza_type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
}
