public class Client {
	public static void main(String[] args) {
		Door door = new Door();
		HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
		hyundaiMotor.move(Direction.UP);
	}
}

//HyundaiMotor 클래스는 현대모터를 구동시킨다. 만약 다른 회사의
//모터를 제어해야 한다면? 예를 들어 LG모터를 구동시키기 위해서는
//어떻게 해야 할까?