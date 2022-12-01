public class Client {
	public static void main(String[] args) {
		Display road = new RoadDisplay();
		road.draw(); // 기본 도로 표시

		Display roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw(); // 기본 도로 표시 + 차선 표시

		// Client 클래스는 동일한 Display 클래스만을 통해서 일관성 있는 방식으로 도로정보를 표시

		Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
		roadWithTraffic.draw(); // 기본 도로 표시 + 교통량 표시
	}
}

//public class Client {
//	public static void main(String[] args) {
//		Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
//		roadWithLaneAndTraffic.draw();
//	}
//}