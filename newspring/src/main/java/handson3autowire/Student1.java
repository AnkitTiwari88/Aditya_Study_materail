package handson3autowire;

public class Student1{
	Course course; 
	 
	Student1(){ 
	System.out.println("Student Profile Created"); 
	} 
	 
	public Course getCourse() { 
	return course; 
	} 
	 
	public void setCourse(Course course) { 
	this.course = course; 
	} 
	 
	void displayInfo() { 
	System.out.println("Student name is Aditya"); 
	} 
	 
	void displayProfile() { 
	displayInfo(); 
	course.displayInfo(); 
	} 


}
