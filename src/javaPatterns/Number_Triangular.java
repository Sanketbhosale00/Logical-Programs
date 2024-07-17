package javaPatterns;

public class Number_Triangular {

	public static void main(String[] args) {
		int rows = 4;
		int cols = 7;
		int num=1;
		int mid = (cols+rows)/2;
		//System.out.println(mid);
		for(int i =1;i<=rows;i++) {
			num = i;
			for(int j=cols/2;j>i-1;j--) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(num);
			}
			for(int j=(cols+i)/2;j<=cols;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
