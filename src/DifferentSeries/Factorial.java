package DifferentSeries;

public class Factorial {
	public static void printFactorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = (fact*i);
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		int num = 9;
		printFactorial(num);
	}

}
