public class HyundaiElevatorFactory extends ElevatorFactory {
	private static ElevatorFactory factory;

	private HyundaiElevatorFactory() {
	}

	public static ElevatorFactory getInstance() {
		if (factory == null)
			factory = new HyundaiElevatorFactory();
		return factory;
	}

	public Motor createMotor() {
		return new LGMotor();
	}

	public Door createDoor() {
		return new LGDoor();
	}
}