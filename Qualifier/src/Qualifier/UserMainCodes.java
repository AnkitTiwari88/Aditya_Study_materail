package Qualifier;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
public class UserMainCodes {
    
    public static ArrayList<String> calculateDiscount(HashMap<String,String> hm1, HashMap<String,Integer> hm2) {
        
        //fill the code
    	double t = 0.0;
    	ArrayList <String> li = new ArrayList<>();
    	for(Map.Entry<String , String> entry : hm1.entrySet()) {
    		String arr[]= entry.getValue().split("-");
    		int di = 2015 - Integer.parseInt(arr[2]);
    		di = di-1;
    		int am =hm2.get(entry.getKey());
    		if(am>=20000 && di>=5) {
    			t=am*0.2;
    		}
    		else if(am> 20000 && di<5) {
    			t=am*0.1;
    		}
    		else if(am<20000 && di<5) {
    			t = 0.15 * am;
    		}
    		li.add(entry.getKey()+""+(int) t);
    	}
    	
    return li;
    }
    
}
