package week3.day2.assignment;

public class Student{
	public void getStudentInfo(int id) {
		System.out.println("Student ID" + "-"+ id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student ID" + "-" + id + "&"+"Student Name" + "-" +  name );
	}
	public void getStudentInfo(String email, long phoneNo) {
		System.out.println("Student email" + "-" +email+ "&" + "Student Phone Number" +"-" +phoneNo);
	} 
	public static void main(String[] args) {
		Student obj = new Student();
		obj.getStudentInfo(1);
		obj.getStudentInfo(1, "Mohan");
		obj.getStudentInfo("mohan00610@gmail.com", 9486906258L);
	}
	
		}
//Method overload Assignment
//===========================

     // Class: Students
     // Methods: getStudentInfo()

//Description: 
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber