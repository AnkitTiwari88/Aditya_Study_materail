package examples;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a=0;int b=1;
		System.out.println("Enter the nth position upto which you want:");
		int n = sc.nextInt();
		System.out.print(a+" "+b+" ");
		for(int i=2 ; i<n ;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
