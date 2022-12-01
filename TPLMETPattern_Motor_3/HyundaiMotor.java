public class HyundaiMotor extends Motor { // Motor를 상속받아서 HyundaiMotor를 구현함
	public HyundaiMotor(Door door) {
		super(door);
	}

	private void moveHyundaiMotor(Direction direction) {
// Hyundai Motor를 구동시킨다.
		System.out.println("moveHynudaiMotor "+direction);
	}

	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.MOVING)
			return;
		DoorStatus doorStatus = door.getDoorStatus();
		if (doorStatus == DoorStatus.OPENED)
			door.close();
		moveHyundaiMotor(direction); // move 메서드는 이 구문을 제외하면 LGMotor와 동일함
		setMotorStatus(MotorStatus.MOVING);
	}
}