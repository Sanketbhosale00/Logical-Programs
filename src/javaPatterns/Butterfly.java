package javaPatterns;

public class Butterfly {

	public static void main(String[] args) {
		int r = 8;
		for(int i=1;i<=r/2;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=(r-(2*i));j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		//Down
		for(int i=r/2;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=(r-(2*i));j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
