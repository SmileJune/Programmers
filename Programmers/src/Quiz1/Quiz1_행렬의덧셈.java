package Quiz1;

public class Quiz1_행렬의덧셈 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[sizeOfRow(arr1)][sizeOfColomn(arr1)];
		sumOfMatrix(arr1, arr2, answer);
        return answer;
    }

	private void sumOfMatrix(int[][] arr1, int[][] arr2, int[][] answer) {
		for(int i=0; i<sizeOfRow(arr1); i++) {
			for(int j=0; j<sizeOfColomn(arr1); j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
	}

	private int sizeOfColomn(int[][] arr1) {
		return arr1[0].length;
	}

	private int sizeOfRow(int[][] arr1) {
		return arr1.length;
	}
}
