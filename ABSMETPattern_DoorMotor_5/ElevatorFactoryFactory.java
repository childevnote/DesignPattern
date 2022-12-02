public class ElevatorFactoryFactory {
	public static ElevatorFactory getFactory(VendorID vendorID) { // 팩토리 메서드
		ElevatorFactory factory = null;
		switch (vendorID) {
		case LG:
			factory = LGElevatorFactory.getInstance();
			break;
		case HYUNDAI:
			factory = HyundaiElevatorFactory.getInstance();
			break;
		case SAMSUNG:
			factory = SamsungElevatorFactory.getInstance();
			break;
		}
		return factory;
	}
}