package examples;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		System.out.println("Enter the array elements :");
		for(int i = 0 ; i<n ; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i = 0 ; i<n/2 ; i++) {
			int temp = arr[n-i-1];
			arr[n-i-1] = arr[i];
			arr[i] = temp;
			
		}
		
		System.out.println("Reversed array is : ");
		
		for(int i = 0 ; i<n ; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
