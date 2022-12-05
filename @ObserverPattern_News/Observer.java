
public class Observer {
	public String subscriber;
	
	public void receive(String news) {
		System.out.println(this.subscriber+"님이 다음 뉴스를 받음. : "+news);
	}
}
