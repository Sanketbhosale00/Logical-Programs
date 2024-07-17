package DifferentSeries;

public class FibonacciSeries {
	public static void printFibonacciSeries(int num){
		int a = 0;
		int b = 1;
		int temp=0;
		System.out.print(a+" "+b+" ");
		
		
		for(int i=1;i<=num;i++) {
			temp= a+b ;
			a = b;
			b = temp;
			System.out.print(b+" ");
		}
	}

	public static void main(String[] args) {
		int num = 10;
		printFibonacciSeries(num-2);

	}

}
