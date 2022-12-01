public class LampOnCommand implements Command { // 램프를 켜는 기능의 캡슐화
	private Lamp theLamp;

	public LampOnCommand(Lamp theLamp) {
		this.theLamp = theLamp;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theLamp.turnOn();
	}
}
