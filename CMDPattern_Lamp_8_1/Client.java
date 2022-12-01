public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Button lampButton = new Button(lamp);
		lampButton.pressed();
	}
}


//❖ 버튼이 눌렸을 때 램프를 켜는 대신에 다른 기능을 수행하기 위해서
//는 어떤 변경 작업을 해야 되는가? 예를 들어 버튼이 눌리면 알람을
//시작시키려면?
//❖ 뿐만 아니라 버튼이 눌렸을 때 수행되는 기능을 프로그램이 동작할
//때 결정하기 위해서는? 예를 들어 버튼이 처음 눌렸을 때는 램프를
//켜고, 두 번째 눌렸을 때는 알람을 동작시키려면?