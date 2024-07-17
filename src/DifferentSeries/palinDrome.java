package DifferentSeries;

public class palinDrome {
	public static int checkPrime(int num) {
		int rev=0;
		int rem;
		while(num>0) {
			rem = num%10;
			rev = (rev*10)+rem;
			num/=10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int num =13231;
		if(checkPrime(num)==num) {
			System.out.println("Given Number is Palindome");
		}else {
			System.out.println("Given Number is not Palindrome");
		}
	}

}
