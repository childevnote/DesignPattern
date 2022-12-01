public class ThroughputScheduler {
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
		return 0; // 임의로 선택한다.
	}
}


//❖ 현재 ElevatorManager는 ThroughputScheduler를 이용하고 있다.
//즉 엘리베이터의 처리량을 최대화시키는 전략을 사용하고 있다. 만
//약 다른 스케쥴링 전략을 사용해야 한다면? 예를 들어 사용자의 대
//기시간을 최소화시키는 엘리베이터를 선택하는 전략을 사용해야 한
//다면?
//❖ 게다가 스케쥴링 전략이 프로그램 실행 중에 변경을 해야 한다면 즉
//동적 스케쥴링을 지원해야 한다면? 예를 들어 오전에는 대기시간 최
//소화 전략을 사용하고 오후에는 처리량 최대화 전략을 사용해야 한
//다면?