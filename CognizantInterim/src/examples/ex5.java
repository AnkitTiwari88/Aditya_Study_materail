package examples;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		String d = a.replaceAll("[a-zA-Z]", "");
		String c = a.replaceAll("[0-9]", "");
		
		System.out.println(d);
		System.out.println(c);
		
		int n = Integer.parseInt(d);
		int num,sum=0;
		while(n>0) {
			num = n %10;
			sum+= num;
			n=n/10;
		}
		
		System.out.println(sum);
	}

}
