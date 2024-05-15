package Qualifier;

public class NewExampleM {
	
	public int findNumberOfRecordsBasedOnTheAcType(String acType) {
		String lowercaseactype = acType.toLowerCase();
		int count=0;
		for(Map.Entry<String , String> entry : recordMap.entryset()) {
			if(entry.getValue().equalsIgnoreCase(acType)) {
				count++;
			}
		}
		if(count ==0 ) {
			count = -1;
		}
		else {
			count = count;
		}
		return count;
	}
	public List<String> findServiceCodesBasedOnAcType(String acType){
		for()
		if(entry.getValue().equalsIgnoreCase(acType)) {
			list.add(entry.getKey());
		}
		
		return list;
	}
}
