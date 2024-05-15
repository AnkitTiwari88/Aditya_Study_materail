package Qualifier;

public class User {
	public static int getLargestSpan(int a[]) {
		int len = a.length;
		int e =0 , count =0;
		for(int i =0 ; i<len ; i++) {
			for(int j = i+1 ;j<len;j++) {
				if(a[i]==a[j]) {
					e += j;
				}
			}
			if(e-i > count)
		}
		
	}

}
