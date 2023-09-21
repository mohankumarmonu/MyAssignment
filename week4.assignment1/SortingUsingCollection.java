package week4.day1.assignment;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String name[] =  {"HCL","Wipro","Aspire Systems","CTS"};	
		int length = name.length;
		System.out.println(length);
		Arrays.sort(name);
		for (int i = name.length-1; i>=0; i--) {
			System.out.println(name[i] );
			
		}
		
	}

}
//Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

	// get the length of the array		

	// sort the array			

	// Iterate it in the reverse order

	// print the array
		
	// Required Output: Wipro, HCL , CTS, Aspire Systems