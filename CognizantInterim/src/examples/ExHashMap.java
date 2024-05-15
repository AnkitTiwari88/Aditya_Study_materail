package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Map<String ,Integer> map = new HashMap<>();
		System.out.println("Enter the number of keys and value you want to put in map");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			
			System.out.print("Enter Key : ");
			String a = sc.next();
			System.out.println("Enter Value : ");
			int b = sc.nextInt();
			map.put(a, b);
		}
		for(String x : map.keySet()) {
			map.get(x);
		}
		
		for(Map.Entry<String,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"  "+ entry.getValue());
		}
		
		

	}

}
