package Qualifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NewExample {
public static ArrayList<String> calculateDiscount(HashMap<String,String> hm1, HashMap<String,Integer> hm2) {
        
        //fill the code
	double t = 0.0;
	ArrayList<String> list = new ArrayList<>();
	for(Map.Entry<String , String> entry : hm1.entrySet()) {
		String arr[] = entry.getValue().split("-");
		int di = 2015- Integer.parseInt(arr[2]);
		di = di-1;
		int amount = hm2.get(entry.getKey());
		if
	}
    }
    
}

