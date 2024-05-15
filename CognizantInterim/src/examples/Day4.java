package examples;

import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = str.replaceAll("[a-zA-z]", "");
		String str2 = str.replaceAll("[0-9]", "");
		
		int n = Integer.parseInt(str1);
		int num;
		int sum=0;
//		System.out.println("Sum of number is :");
		while(n>0) {
			num = n%10;
			sum+=num;
			n=n/10;
		}
		
		System.out.println("Sum is : "+ sum);

	}

}
