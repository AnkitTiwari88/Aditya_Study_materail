package Qualifier;
import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;


public class MovieName {
	private Map<String ,Float> movieDetailsMap = new HashMap<String,Float>();
	public Map<String ,Float> getMovieDetailsMap(){
		return movieDetailsMap;
	}
	public void setMovieDetailsMap(Map<String ,Float> movieDetailsMap) {
		this.movieDetailsMap = movieDetailsMap;
	}
	public float findMovieRating(String MovieName) {
//		for(Map.Entry<String , Float> entry : movieDetailsMap.entrySet()) {
//			if(entry.getKey().equalsIgnoreCase(MovieName)) {
//				return entry.getValue();
//			}
//		}
		if(movieDetailsMap.containsKey(MovieName)) {
			return movieDetailsMap.get(MovieName);
		}
		return -1;
	}
	public List <String> findMoviesWithHighestRating(){
		List <String> list = new ArrayList<>();
		for(Map.Entry<String , Float> entry : movieDetailsMap.entrySet()) {
			if(entry.getValue() > 4) {
				list.add(entry.getKey());
			}
		}
		return list;
	}
	

	public static void main(String[] args) {
		MovieName book = new MovieName();
		List <String> list1 = new ArrayList<String>();
		Map<String , Float> map = new HashMap<String,Float>();
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
			
			map.put(a[0], Float.parseFloat(a[1]));
			book.setMovieDetailsMap(map);
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
