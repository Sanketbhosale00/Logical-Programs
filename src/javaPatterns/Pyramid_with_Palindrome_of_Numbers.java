package javaPatterns;

public class Pyramid_with_Palindrome_of_Numbers {
//	       1 
//	     2 1 2 
//	   3 2 1 2 3 
//	 4 3 2 1 2 3 4 
// 5 4 3 2 1 2 3 4 5

	public static void main(String[] args) {
	int r = 5;
	for(int i=1;i<=r;i++) {
		for(int j=1;j<=r-i;j++) {
			System.out.print(" ");//print first spaces
		}
		for(int j=1;j<=(2*i-1);j++) {
			
			System.out.print("*");
		}
		
		System.out.println();
		
	}

	}

}
