package javaPatterns;

public class Pyramid_of_Numbers {

	public static void main(String[] args) {
		int r =5;
		
		for(int i=1;i<=r;i++) {
			for(int j=r-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2);j++) {
				if(j%2!=0) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
	}

}
