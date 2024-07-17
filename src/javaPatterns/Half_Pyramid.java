package javaPatterns;

public class Half_Pyramid {

	public static void main(String[] args) {
	int r = 4;
	int c= 4;
	for(int i=1;i<=r;i++) {
		for(int j=3;j>=i;j--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	
	}
}
