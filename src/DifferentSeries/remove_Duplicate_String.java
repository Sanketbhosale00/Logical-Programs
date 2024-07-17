package DifferentSeries;

public class remove_Duplicate_String {
	
	
	public static int removeDuplicate(String name) {
		int count = 0;
		String newName = "";
		for(int i = 0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j)) {
					newName = newName+name.charAt(i);
					count++;
				}
			}
		}
		//System.out.println(newName);
		String a[]=name.split(newName);
		
		String result = "";
		for(String m:a) {
			result = result+m;
		}
		System.out.println(result);
		return count;
	}

	public static void main(String[] args) {
		String name = "Abhijibt";
		name.toLowerCase();
		System.out.println("Count is: "+removeDuplicate(name));

	}

}
