package javaPatterns;

public class traingle_01_Binary {

	public static void main(String[] args) {
		int r = 5;
		int num=1;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print(num);
				}else {
					System.out.print(0);
				}
			}
			System.out.println("");
		}

	}

}
