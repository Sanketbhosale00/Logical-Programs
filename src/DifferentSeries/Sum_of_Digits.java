package DifferentSeries;

public class Sum_of_Digits {
	public static int printSumofDigits(int num) {
		int rem,sum=0;
		while(num>0) {
			rem = num%10;
			sum = sum+rem;
			num/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num = 12386;
		System.out.println("Given Number is: "+num);
		System.out.println("Sum of Digits: "+printSumofDigits(num));
	}

}
