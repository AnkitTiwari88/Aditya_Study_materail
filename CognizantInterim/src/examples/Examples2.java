package examples;

import java.util.Scanner;

public class Examples2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		int n = sc.nextInt();
		int num,res=0;
		while(n>0) {
			num = n%10;
			res= res*10+num;
			n=n/10;
		}
		
		System.out.println("Reversed number is :" + res);
	
	}

}
