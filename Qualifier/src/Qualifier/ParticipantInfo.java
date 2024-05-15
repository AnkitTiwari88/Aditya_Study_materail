package Qualifier;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ParticipantInfo {
	private Map<String ,Integer> participantMap;
	
	public Map<String,Integer> getParticipantMap(){
		return participantMap;
	}
	public void setParticipantMap(Map<String , Integer > participantMap) {
		this.participantMap = participantMap;
	}
	public int findTheTimeTakenByTheParticipant(String participantName) {
		for(Map.Entry<String , Integer> entry : participantMap.entrySet()) {
			if(entry.getKey()== participantName) {
				
				return entry.getValue();
			}
		}
//			if(participantMap.containsKey(participantName)) {
//			}

		return -1;
	}
	
	public List<String> findTheParticipantWithTheShortestTime(){
		List <String> list = new ArrayList<String>();
		int min =Integer.MAX_VALUE;
		for(Map.Entry<String , Integer> entry : participantMap.entrySet()) {
			if(entry.getValue()<min) {
				min = entry.getValue();
			}
			
		}
		for(Map.Entry<String , Integer> entry : participantMap.entrySet()) {
			if(entry.getValue()==min) {	
				list.add(entry.getKey());
			}
		}
		
		return list;
	}

	public static void main(String[] args) {
		
		ParticipantInfo participant = new ParticipantInfo();
		List<String> list1 = new ArrayList<>();
		Map<String , Integer> map = new HashMap<String , Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of records to be added:");
		int n = sc.nextInt();
		System.out.println("Enter the participant records (Participant name:TimeTaken in second");
		String[] participantDetails = new String[n];
		sc.nextLine();
		for(int i = 0 ; i<n ; i++) {
			participantDetails[i] = sc.nextLine();
		}
		for(int i = 0 ; i<participantDetails.length ; i++) {
			String a [] = participantDetails[i].split(":");
			
			map.put(a[0], Integer.parseInt(a[1]));
			participant.setParticipantMap(map);
		}
		
		System.out.println("Enter the participant name to be searched");
		String search = sc.nextLine();
		
		int value = participant.findTheTimeTakenByTheParticipant(search);
		if(value>0) {
			System.out.println(value);
		}
		
		else {
			System.out.println(search+" is an invalid participant name");
		}
		
		list1= participant.findTheParticipantWithTheShortestTime();
		System.out.println("Participant name with the shortest time taken:");
		for(String s : list1) {
			System.out.println(s);
		}
		
		sc.close();
	}

}
