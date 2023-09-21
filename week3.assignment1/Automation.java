package week3.day1.assignment;

public class Automation extends MultipilLanguage implements Language,TextToll{

	@Override
	public void selenium() {
System.out.println("Seleium");		
	}

	@Override
	public void java() {
System.out.println("Java");		
	}

	@Override
	public void ruby() {
System.out.println("Ruby");		
	}
	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.selenium();
		obj.java();
		obj.ruby();
		obj.phyton();
	}

}
