public class Client {
	public static void main(String[] args) {
		ElevatorManager elevator = new ElevatorManager(10);
		elevator.requestElevator(10, Direction.UP);
	}
}