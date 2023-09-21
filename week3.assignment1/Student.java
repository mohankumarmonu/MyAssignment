package week3.day1.assignment;

public class Student extends Department {
	public void studentName() {
		System.out.println("This is Student Name");
	}
	public void studentDept() {
		System.out.println("This is StudentDept ");
	}
	public void studentId() {
		System.out.println("This is Student ID ");
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}
}

//studentName(),studentDept(),studentId()