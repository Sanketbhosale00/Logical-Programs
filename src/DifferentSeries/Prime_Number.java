package DifferentSeries;

public class Prime_Number {
	public static boolean checkPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 15;
		if(checkPrime(num)) {
			System.out.println("Given Number is Prime.");
		}else
			System.out.println("Given Number is Not Prime.");

	}

}
