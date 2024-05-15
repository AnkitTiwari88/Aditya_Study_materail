package Qualifier;

public class UserMainCod {
	public static int countWords(String a , String b) {
		
		String arr[]= a.split(" ");
		int count = 0 ;
		
		for(int i= 0 ; i<arr.length ; i++) {
			if(b.equals(arr[i])) {
				count++;
			}
		}
		return count;
	}
}
