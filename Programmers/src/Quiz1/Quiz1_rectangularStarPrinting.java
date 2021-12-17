package Quiz1;

import java.util.Scanner;

public class Quiz1_rectangularStarPrinting {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	
    	drawRectangularStar(n, m);
        
    }

	private static void drawRectangularStar(int n, int m) {
		for(int i=0; i<m; i++) {
    		oneStarRow(n);
    		nextLine();
    	}
	}

	private static void nextLine() {
		System.out.println();
	}

	public static void oneStarRow(int n) {
		System.out.printf("*".repeat(n));
	}
}
