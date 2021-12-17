package Quiz1;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{0,2,4,4,2},{0,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		int answer = 0;
		ArrayList<Integer> bucket = new ArrayList<Integer>();
	
		int[][] board_2= new int[5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5 ; j++) {
				board_2[i][j] = board[j][i];
			}
		}
		
		
		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5 ; j++) {
//				System.out.println(board_2[i][j]);
//			}
//		}

		
		
		for(int move : moves) {
			for(int i=0; i<board_2[move-1].length; i++) {
				if(board_2[move-1][i]!=0) {
					bucket.add(board_2[move-1][i]);
					board_2[move-1][i]=0;
					break;		
				
				}
			}
		}
		
		for(int buc : bucket) {
			System.out.println(buc);
		}
		System.out.println("--------");
		for(int i=0 ; i<bucket.size()-1; i++) {
			if(bucket.get(i)==bucket.get(i+1)) {
				bucket.remove(i+1);
				bucket.remove(i);
				answer+=2;
				i=0;
			}
		}
		
		for(int buc : bucket) {
			System.out.println(buc);
		}
		
	//1이라면 board_2[1][?]앞에서 찾아가면서 0이 아닌수가 나오면0으로 바꿔주고 값을 빼온다.
		
		

		
		
		
		
		
	}
	

}


//