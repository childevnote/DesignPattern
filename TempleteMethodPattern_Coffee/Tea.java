
public class Tea {
	
	//홍차를 우려내는 메소드
	void prerpareRecipe() {
		boilWater(); // 물을 끓이는 메소드
		steepTeaBag(); // 커피를 우려내는 메소드
		pourInCup(); // 커피를 컵에 따르는 메소드
		addLemon(); // 설탕과 우유를 추가하는 메소드
	}
	
	
	
	//Coffee 클래스와 코드가 중복되는 부분
	public void boilWater() {
		System.out.println("물 끓이는 중...");
	}
	
	public void pourInCup() {
		System.out.println("컵에 따르는 중...");
	}
	
	//홍차 전용 메소드
	public void steepTeaBag() {
		System.out.println("찻잎을 우려내는 중...");
	}
	
	public void addLemon() {
		System.out.println("레몬을 추가하는 중...");
	}
}
