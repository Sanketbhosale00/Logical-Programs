package DifferentSeries;

public class Armstrong_Number {
	public static int checkArmstrong(int num) {
		int rem;
		int digit=0;
		int sum=0;
		int temp=num;
		while(temp>0) {
			temp/=10;
			digit++;
		}
		temp=num;
		while(temp>0) {
			rem=temp%10;
			sum = sum+(int)Math.pow(rem,digit);
			temp/=10;
		}
		System.out.println(num);
		System.out.println(sum);
		
		return sum;
	}

	public static void main(String[] args) {
		int num = 153;
		
		
		if(checkArmstrong(num)==num) {
			System.out.println("Given Number is Armstronge");
		}else {
			System.out.println("Not Armstrong");
		}

	}

}
