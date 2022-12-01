public class Client {
	public static void main(String[] args) {
		RoadDisplay road = new RoadDisplay();
		road.draw(); // 기본 도로만 표시
		RoadDisplay roadWithLane = new RoadDisplayWithLane();
		roadWithLane.draw(); // 기본 도로 + 차선 표시
		
		RoadDisplay roadWithTraffic = new RoadDisplayWithTraffic();
		roadWithTraffic.draw(); //기본 도로 + 교통량 표시
		
	}
}

//❖ 또다른 추가적인 도로 표시 기능을 구현하고 싶다면 어떻게 해야 하
//는가? 예를 들어 기본 도로 표시에 교통량을 표시하고 싶다면?
//❖ 뿐만 아니라 여러가지 추가 기능의 조합하여 제공하고 싶다면 어떻
//게 해야 하는가? 예를 들어 기본 도료 표시에 차선 표시 기능과 교통
//량 표시 기능을 함께 제공하고 싶다면?