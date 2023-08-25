package week1.day2;

public class Week1FibonacciSeries {
	public static void main(String[] args) {
		int firstNum=0; 
		int secNum=1;
		int sum = 0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 0; i < 11; i++) {
			sum = firstNum + secNum ;
			firstNum = secNum ;
			secNum = sum ;
			System.out.println(sum);
		}
		
		
		
	}
	
}







//Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
//Print first number
//Iterate from 1 to the 11
//Add first and second number assign to sum
//Assign second number to the first number
//Assign sum to the second number
//Print sum