public class Client {
	public static void main(String[] args) {
		Door hyundaiDoor = DoorFactory.createDoor(VendorID.HYUNDAI);
		Motor hyundaiMotor = MotorFactory.createMotor(VendorID.HYUNDAI);
		hyundaiMotor.setDoor(hyundaiDoor);
		hyundaiDoor.open();
		hyundaiMotor.move(Direction.UP);
	}
}