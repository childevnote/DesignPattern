public class Client {
	public static void main(String[] args) {
		ElevatorFactory factory = null;
		String vendorName = "Samsung";
		if (vendorName.equalsIgnoreCase("LG"))
			factory = new LGElevatorFactory();
		else if (vendorName.equalsIgnoreCase("Samsung"))
			factory = new SamsungElevatorFactory();
		else
			factory = new HyundaiElevatorFactory();
		Door door = factory.createDoor();
		Motor motor = factory.createMotor();
		motor.setDoor(door);
		door.open();
		motor.move(Direction.UP);
	}
}