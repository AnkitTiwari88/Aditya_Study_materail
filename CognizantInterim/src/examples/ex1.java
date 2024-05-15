package examples;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if it's prime or not ");
		int n = sc.nextInt();
		
		if(n%2==1) {
			System.out.println("it's prime :" + n);
		}
		else {
			System.out.println("it's Even :" + n);
		}
		
		

	}

}
