package DifferentSeries;

public class Count_Characters {
	public static int checkCountofString(String ss) {
		int count=0;
		for(int i=0;i<ss.length();i++) {
			count++;
			
//			if(ss.charAt(i)!=' ') {
//				count++;
//			}
		}
		return count;
	}

	public static void main(String[] args) {
		String  ss="1234567";
		int count = checkCountofString(ss);
		System.out.println(count);

	}

}
