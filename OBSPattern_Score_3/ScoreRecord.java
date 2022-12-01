import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>();
	private List<DataSheetView> dataSheetViews = new ArrayList<DataSheetView>();
	private MinMaxView minMaxView;

	public void addDataSheetView(DataSheetView dataSheetView) {
		dataSheetViews.add(dataSheetView);
	}

	public void setMinMaxView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView;
	}

	public void addScore(int score) {
		scores.add(score);
		for (DataSheetView dataSheetView : dataSheetViews) // 기능 변경을 위해서 기존 소스 코드를 수정하므로 OCP를 위반하는 것임
			dataSheetView.update(); // 각 DataSheetView에게 점수의 변경을 통보
		minMaxView.update(); // MinMaxView에게 점수의 변경을 통보
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}
}