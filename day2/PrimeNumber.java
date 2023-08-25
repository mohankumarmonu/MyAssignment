package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=11;
		boolean flag = false ;
		int m=n/2;
		for (int i = 2; i<=m; i++) {
		if (n%i==0) {
			flag = true;
			break;
		}
		}
		if (!flag) 
			System.out.println("The num is prime");
		else 
				System.out.println("The num is not prime");
			}
			
				}
	

	

