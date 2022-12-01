public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Alarm alarm = new Alarm();
		
		Button button = new Button(lamp, alarm);
		button.setMode(Mode.LAMP);
		button.pressed();
		
		button.setMode(Mode.ALARM);
		button.pressed();
	}
}

// Mode를 설정함으로서 버튼의 동작을 ㅂ녀경시킴
// 문제점 : 기능의 변경 또는 새로은 기능의 추가 때마다
// Button 클래스를 수정해야함 -> OCP를 위반