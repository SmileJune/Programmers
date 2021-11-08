

public class Quiz2_3 {
	
	

	public static void main(String[] args) {
		int m =6;
		int n =4;
		int[][] picture = {{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,0,3}};
		int numberOfArea = 0;
		int presentNumber = 0;
		int SizeOfOneArea = 0;
		int maxSizeOfOneArea = 0;
		
		
		
		
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
			
				if(picture[i][j]!=0) {
					int a=i, b=j;
					presentNumber = picture[a][b];
					picture[a][b] = 0;
					numberOfArea++;
					SizeOfOneArea++;
					
					if(i-1>=0) {
						if(picture[i-1][j]==presentNumber){
							picture[i-1][j]=0;
							SizeOfOneArea++;
							
							if(i-2>=0) {
								if(picture[i-2][j]==presentNumber){
									picture[i-2][j]=0;
									SizeOfOneArea++;
							}
							
						}	
					}
					
					
					
					
					
					
					
					
					
				}
				
				
				
				
				
				
				
			}
		}
		
		
		
		
		
		
		
		
	}
}
