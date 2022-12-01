// 버튼을 눌렸을 때 다른 기능을 실행하는 경우
public class Button {
	private Alarm theAlarm;

	public Button(Alarm theAlarm) {
		this.theAlarm = theAlarm;
	}

	public void pressed() {
		theAlarm.start();
	}
}

// 버튼을 눌렀을 때 알람을 시작하게 하려면 
// Button 클래스의 pressed 메서드 수정이 필요함
// 기능 변경을 위해서 기존 소스코드를 수정하므로
// OCP를 위반한다.