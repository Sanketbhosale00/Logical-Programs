package DifferentSeries;

public class Multiplication_Table {
	public static void printMultiplicationTable(int num,int range) {
		for(int i=1;i<=range;i++) {
			System.out.println(i+" * "+num+" = "+(i*num));
		}
	}

	public static void main(String[] args) {
		int num = 5;
		int range = 10;
		printMultiplicationTable(num,range);

	}

}
