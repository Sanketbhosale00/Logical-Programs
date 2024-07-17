package javaPatterns;

public class Inverted_Half_Pyramid_with_Numbers {

	public static void main(String[] args) {
		int r=5;
		
		for(int i=1;i<=r;i++) {
			int num=1;
			for(int j=5;j>=i;j--) {
				System.out.print(num++);
			}
			System.out.println("");
		}

	}

}
