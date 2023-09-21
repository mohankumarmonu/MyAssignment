package week4.day1.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> set = new TreeSet<>();
		for (int each : data) {
			set.add(each);
			
		}
		//System.out.println(set);
		
		List<Integer> list = new ArrayList<>(set);
		int size = list.size();
		System.out.println(list.get(size-2));

	}

}



//Here is the input
		//int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		
		 //Pseudo Code: 
		 // a) Create a empty Set Using TreeSet
		 // b) Declare for loop iterator from 0 to data.length and add into Set 
		 //c) converted Set into List
		 // d) Print the second last element from List