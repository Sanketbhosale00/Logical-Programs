package javaPatterns;

public class Solid_Rhombus {

	public static void main(String[] args) {
		int r =5;
		for(int i=1;i<=r;i++) {
			for(int j=r-i;j>=1;j--) {
				System.out.print("   ");
			}
			for(int j=1;j<=r;j++) {
				System.out.print(" * ");
			}
			System.out.println();
			
		}
	}

}
