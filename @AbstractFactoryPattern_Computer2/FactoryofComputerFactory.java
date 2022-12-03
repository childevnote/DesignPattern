
public class FactoryofComputerFactory {
	public void createComputer(String type) {
		ComputerFactory cFactory = null;
		
		switch (type) {
		case "LG":
			cFactory = new LGComputerFactory();
			break;
		case "Samsung":
			cFactory = new SamsungComputerFactory();
			break;
		}
		
		cFactory.createKeyboard();
		cFactory.createMouse();
	}
}
