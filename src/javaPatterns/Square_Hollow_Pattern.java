package javaPatterns;

public class Square_Hollow_Pattern {
	

	public static void main(String[] args) {
		int col=5;
		int rows = 6;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=col;j++) {
				if(i==1||j==1||i==rows||j==col) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}

	}

}
