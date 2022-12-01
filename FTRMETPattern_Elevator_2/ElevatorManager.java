import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class ElevatorManager {
	private List<ElevatorController> controllers;
	private ThroughputScheduler scheduler ;

	public ElevatorManager(int controllerCount) {
		controllers = new ArrayList<ElevatorController>(controllerCount);
		for (int i = 0; i < controllerCount; i++) {
			ElevatorController controller = new ElevatorController(i + 1);
			controllers.add(controller);
		}
	}

	protected abstract ElevatorScheduler getScheduler(); // primitive 메서드

	void requestElevator(int destination, Direction direction) { // 템플릿 메서드
		// 하위클래스에서 오버라이드한 getScheduler 메서드를 호출
		ElevatorScheduler scheduler = getScheduler();
		int selectedElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectedElevator).gotoFloor(destination);
	}
}