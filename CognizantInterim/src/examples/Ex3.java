package examples;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the elements in array");
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i = 0 ; i <arr.length ; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		
		System.out.println("Min :"+ min + " Max" + max);
		
		
	}

}
