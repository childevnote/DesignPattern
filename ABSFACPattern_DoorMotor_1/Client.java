
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HyundaiDoor hdoor = new HyundaiDoor();
		LGDoor ldoor = new LGDoor();
		
		hdoor.doClose();
		hdoor.doOpen();
		
		ldoor.doClose();
		ldoor.doOpen();
	}

}
