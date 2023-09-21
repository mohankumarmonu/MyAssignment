package week3.day1.assignment;

public class Desktop extends Computer {
	public void deskTopSize() {
		System.out.println("This is deskTopSize");
		
	}
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.deskTopSize();
	}
	
}
