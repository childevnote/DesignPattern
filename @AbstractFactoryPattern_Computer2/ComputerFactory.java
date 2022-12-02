
public interface ComputerFactory {
	/*
	public void createComputer(String type) {
		KeyboardFactory kFactory = new KeyboardFactory();
		MouseFactory mFactory = new MouseFactory();
		
		kFactory.createKeyboard(type);
		mFactory.createMouse(type);
		
		System.out.println("---- "+type+" 컴퓨터 완성 ----");
	}*/
	
	public Keyboard createKeyboard();
	public Mouse createMouse();
}
