package examples;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0 , b =1,c;
		System.out.println("Enter the nth position :");
		int n = sc.nextInt();
		System.out.print(a+" "+b+" ");
		for(int i=2 ; i<=n ; i++) {
			c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		

	}

}
