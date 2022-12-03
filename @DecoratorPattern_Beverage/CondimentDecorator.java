
public abstract class CondimentDecorator extends Beverage{
	Beverage beverage; //각 데코레이터가 감쌀 음료를 나타내는 Beverage 객체를 저장
	
	public abstract String getDescription();
}
