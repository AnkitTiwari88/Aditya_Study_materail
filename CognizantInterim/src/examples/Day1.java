package examples;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String which you want to reverse :");
		String str = sc.nextLine();
		String rev="";
		
		for(int i = 0 ; i<str.length() ; i++) {
			char d = str.charAt(i);
			rev = d+rev;
			
		}
		if(rev.equals(str)) {
			System.out.println("Reversed String : "+rev);
		}
		
		else {
			System.out.println("Not a plaindrome");
		}
		

	}

}
