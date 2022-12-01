
public class Coffee {
	void prerpareRecipe() {
		boilWater(); //물을 끓이는 메소드
		brewCoffeeGrinds(); //커피를 우려내는 메소드
		pourInCup(); //커피를 컵에 따르는 메소드
		addSugarAndMilk(); //설탕과 우유를 추가하는 메소드
	}
	
	public void boilWater() {
		System.out.println("물 끓이는 중...");
	}
	
	public void brewCoffeeGrinds() {
		System.out.println("필터로 커피를 우려내는 중...");
	}
	
	public void pourInCup() {
		System.out.println("컵에 따르는 중...");
	}
	
	public void addSugarAndMilk() {
		System.out.println("설탕과 우유를 추가하는 중...");
	}
}
