
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		News news = new News();
		Subscriber1 subscruber1 = new Subscriber1("김철수");
		Subscriber2 subscruber2 = new Subscriber2("김영희");
		
		news.attach(subscruber1);
		news.attach(subscruber2);
		
		String news_contents = "러시아 - 우크라이나 관련 뉴스입니다.";
		
		news.notifyObservers(news_contents);
		
		news.detach(subscruber2);
		
		news.notifyObservers(news_contents);


	}

}
