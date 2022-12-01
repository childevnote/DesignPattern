// 버튼을 누르는 동작에 따라서 다른 기능을 실행하는 경우
// 처음 눌렀을 때는 램프를 켜고 두번째 눌렀을 때는 알람을 동작하게
enum Mode {
	LAMP, ALARM
};

public class Button {
	private Lamp theLamp;
	private Alarm theAlarm;
	private Mode theMode;

	public Button(Lamp theLamp, Alarm theAlarm) {
		this.theLamp = theLamp;
		this.theAlarm = theAlarm;
	}

	public void setMode(Mode mode) {
		this.theMode = mode;
	}

	public void pressed() { // Mode에 따라서 램프와 알람을 동작시킴
		switch (theMode) {
		case LAMP:
			theLamp.turnOn();
			break;
		case ALARM:
			theAlarm.start();
			break;
		}
	}
}
