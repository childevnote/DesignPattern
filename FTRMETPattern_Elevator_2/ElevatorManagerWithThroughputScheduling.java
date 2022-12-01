public class ElevatorManagerWithThroughputScheduling extends ElevatorManager {
	public ElevatorManagerWithThroughputScheduling(int controllerCount) {
		super(controllerCount);
	}

	protected ElevatorScheduler getScheduler() { // 처리량 최대화 전략을 사용함
		ElevatorScheduler scheduler = ThroughputScheduler.getInstance();
		return scheduler;
	}
}