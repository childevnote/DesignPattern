import java.util.Calendar;

public class ElevatorManagerWithDynamicScheduling extends ElevatorManager {
	public ElevatorManagerWithDynamicScheduling(int controllerCount) {
		super(controllerCount);
	}

	protected ElevatorScheduler getScheduler() { // 동적 스케줄링을 사용함
		ElevatorScheduler scheduler = null;
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if (hour < 12) // 오전
			scheduler = ResponseTimeScheduler.getInstance();
		else // 오후
			scheduler = ThroughputScheduler.getInstance();
		return scheduler;
	}
}