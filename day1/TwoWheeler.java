package week1.day1;

public class TwoWheeler{
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 345677228l;
	boolean isPunctured = true;
	String bikeName = "pulsur";
	double runningKM = 3458.33;
	
	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
		System.out.println(obj.noOfWheels);
		System.out.println(obj.noOfMirrors);
		System.out.println(obj.chassisNumber);
		System.out.println(obj.isPunctured);
		System.out.println(obj.bikeName);
		System.out.println(obj.runningKM);
	}

}
