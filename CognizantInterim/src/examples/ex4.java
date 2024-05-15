package examples;

import java.util.Iterator;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tne string which we want to reverse:");
		String a = sc.nextLine();
		String rev="";
		for(int i = 0 ; i< a.length() ; i++) {
			char d = a.charAt(i);
			rev= d + rev;
		}
		System.out.println("Reversed string is : "+rev);
		
	}

}
