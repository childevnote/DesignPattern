public class Client {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		// 3개까지의 점수만 출력함
		DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
		scoreRecord.setDataSheetView(dataSheetView);
		for (int index = 1; index <= 5; index++) {
			int score = index * 10;
			System.out.println("Adding " + score);
			// 10 20 30 40 50을 추가함, 추가할 때마다 최대 3개의 점수만 출력함
			scoreRecord.addScore(score);
		}
	}
}

// ❖ 성적을 다른 방식으로 출력하고 싶다면 어떤 변경 작업을 해야 하는
// 가? 예를 들어 성적을 목록으로 출력하지 않고 최소/최대값만을 출
// 력하려면?
// ❖ 뿐만 아니라 성적을 동시에 여러 가지 형태로 출력하려면 어떤 변경
// 작업을 해야 하는가? 예를 들어 성적이 입력되면 최대 3개 목록으로
// 출력, 최대 5개 목록으로 출력 그리고 동시에 최소/최대값만을 출력
// 하려면?
// ❖ 그리고 프로그램이 실행 시에 성적의 출력 대상이 변경되는 것을 지
// 원한다면 어떤 변경 작업을 해야 하는가? 예를 들어 처음에는 목록
// 으로 출력하고 나중에는 최소/최대값을 출력하려면?