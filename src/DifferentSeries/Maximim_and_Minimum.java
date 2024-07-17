package DifferentSeries;

public class Maximim_and_Minimum {
	public static int findMin(int arr[]) {
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int findMax(int arr[]) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = {5,8,65,59,55,1,0,655};
		int max = findMax(arr);
		int min = findMin(arr);
		System.out.println("Maximum Element from Array: "+max);
		System.out.println("Minimum Element from Array: "+min);

	}

}
