public class ElevatorManagerWithResponseTimeScheduling extends ElevatorManager {
	public ElevatorManagerWithResponseTimeScheduling(int controllerCount) {
		super(controllerCount);
	}

	protected ElevatorScheduler getScheduler() { // 대기 시간 최소화 전략을 사용함
		ElevatorScheduler scheduler = ResponseTimeScheduler.getInstance();
		return scheduler;
	}
}