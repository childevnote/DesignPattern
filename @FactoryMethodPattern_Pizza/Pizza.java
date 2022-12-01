
public abstract class Pizza {
	String pizza_name;
	
	public Pizza() {
		
	}

	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"를 준비하는 중입니다...");
	}
	
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"를 굽는 중입니다...");
	}
	
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"를 자르는 중입니다...");

	}
	
	public void box() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"를 담는 중입니다...");

	}
	
	public String getName() {
		return pizza_name;
	}
}
