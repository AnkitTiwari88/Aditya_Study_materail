package Qualifier;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UserMainCode {
	public static TreeMap<Integer,Integer>calculateRevisedSalary(HashMap<Integer,String> dobMap ,HashMap<Integer,Integer>salMap){
		TreeMap<Integer,Integer> revisedSalaryMap = new TreeMap<>();
		for(Map.Entry<Integer,String> entry : dobMap.entrySet()) {
			int id = entry.getKey();
			String dob = entry.getValue();
			int salary = salMap.get(id);
			int age = calculateAge(dob);
			int bonus=0;
			if(salary<5000) {
				bonus=-100;
			}
			else if(age>=25&& age<=30) {
				bonus= (int) (salary*0.2);
			}
			else if(age>=31 && age<=60) {
				bonus = (int) (salary*0.3);
			}
			
			else if(age<25||age>60) {
			  bonus =-200;
			}
			int revisedSalary = salary+bonus;
			revisedSalaryMap.put(id , revisedSalary);
		}
		return revisedSalaryMap;
	}
	
	public static int calculateAge(String dob) {
		String arr[]= dob.split("-");
		int birthYear = Integer.parseInt(arr[2]);
		return 2014 - birthYear;
	}
	
}
