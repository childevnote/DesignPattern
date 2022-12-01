import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>();
	private MinMaxView minMaxView;

	public void setMinMaxView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView ;
		}

	public void setStatisticsView(MinMaxView minMaxView) { // MinMaxView를 설정함
		this.minMaxView = minMaxView;
	}

	public void addScore(int score) {
		scores.add(score);
		minMaxView.update(); // MinMaxView에게 점수의 변경을 통보함
//		MinMaxView를 이용하도록 소스코드가 수정되었음
//		기능 변경을 위해서 기존 소스 코드를 수정하므로
//		OCP를 위반하는 것임
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}
}
