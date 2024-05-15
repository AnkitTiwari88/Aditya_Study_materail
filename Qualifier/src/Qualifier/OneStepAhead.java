package Qualifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OneStepAhead {
	private Map<String ,String> shoeMap = new HashMap<String,String>();
	public Map<String ,String> shoeMap(){
		return shoeMap;
	}
	public void setShoeMap(Map<String ,String> shoeMap) {
		this.shoeMap = shoeMap;
	}
	public int findTheCountOfOrderIdsBasedOnTheShoeType(String shoeType) {
		int count=0;
		for(Map.Entry<String , String> entry : shoeMap.entrySet())  {
			count++;
			return count;
		}
		return -1;
	}
	public List <String> findOrderIdsBasedOnTheShoeType(String shoeType){
		List <String> list = new ArrayList<>();
		for(Map.Entry<String , String> entry : shoeMap.entrySet()) {
			if(entry.getValue()== shoeType) {
				list.add(entry.getKey());
			}
		}
		return list;
	}
	

	public static void main(String[] args) {
		MovieName book = new MovieName();
		List <String> list1 = new ArrayList<String>();
		Map<String , String> map = new HashMap<String,String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of records to be added:");
		int n = sc.nextInt();
		System.out.println("Enter the Movie records (Movie Name : Rating):");
		String [] bookDetails = new String[n];
		sc.nextLine();
		for(int i =0 ; i<bookDetails.length ; i++) {
			bookDetails[i] = sc.nextLine();
		}
		for(int i = 0 ; i<bookDetails.length ; i++) {
			String a[]= bookDetails[i].split(":");
			
			map.put(a[0], a[1]);
			book.setShoeMap(map);
		}
		System.out.println("Enter the movie name needs to be searched");
		String search = sc.nextLine();
		float rating = book.findMovieRating(search);
		if(rating==-1) {
			System.out.println(search+" is an invalid movie name");
		}
		else {
			System.out.println(rating);
		}
		list1 = book.findMoviesWithHighestRating();
		if(list1!=null && list1.size()>=1) {
			System.out.println("The names of the movie with highest rating are:");
			for(String s : list1) {
				System.out.println(s);
			}
		}
		else
			System.out.println("No movies were found with highest rating");
	} 


	}

}
