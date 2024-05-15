package handson3;

import handson3.Education;

public class Student {
	private int id;
	private String name;
	private Education education;
	public Student() {
		System.out.println("No Data");
	}
	public Student(int id, String name, Education education){
		this.id = id;
		this.name = name;
		this.education = education;
	}
	public void displayInfo(){
		System.out.println(id + " " + name);
		System.out.println(education.show());
	}

}
