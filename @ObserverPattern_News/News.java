import java.util.ArrayList;
import java.util.List;

public class News {
	private List<Observer> observers = new ArrayList<Observer>();
	
	
	//1. 옵저버 리스트에 추가
	public void attach(Observer observer) {
		System.out.println(observer.subscriber+"님이 이제부터 뉴스를 구독합니다.");
		observers.add(observer);
	}
	
	
	//2. 옵저버 리스트에서 제거
	public void detach(Observer observer) {
		System.out.println(observer.subscriber+"님이 더 이상 뉴스를 받지 않습니다.");
		observers.remove(observer);
	}
	
	
	//3. 옵저버들에게 알림
	public void notifyObservers(String news_contents) {
		for (int i=0; i<observers.size(); i++) {
			Observer o = observers.get(i);
			o.receive(news_contents);
		}
	}
}
