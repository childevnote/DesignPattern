public class Client {
	public static void main(String[] args) {
		Door lgDoor = DoorFactory.createDoor(VendorID.LG);
		Motor lgMotor = MotorFactory.createMotor(VendorID.LG);
		lgMotor.setDoor(lgDoor);
		lgDoor.open();
		lgMotor.move(Direction.UP);
	}
}


//❖ 현재 프로그램은 LG의 부품(LGMotor와 LGDoor)를 사용하고 있다.
//만약 다른 제조업체의 부품을 사용해야 한다면? 예를 들어 LG 부품
//대신에 현대의 부품(HyundaiMotor와 HyundaiDoor)를 사용해야 한
//다면?
//❖ 게다가 새로운 제조업체의 부품을 사용해야 한다면? 예를 들어 삼성
//에서 엘리베이터 부품을 생산하기 시작해서 SamsungMotor와
//SamsungDoor 클래스를 사용해야 한다면?