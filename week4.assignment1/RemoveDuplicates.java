package week4.day1.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String name = "PayPal India";
		char[] charArray = name.toCharArray();
		Set<Character> charset = new LinkedHashSet<>();
		Set<Character> dupcharset = new LinkedHashSet<>();
		for (Character character : charArray) {
			if (!charset.add(character)) {
				dupcharset.add(character);
			}
			charset.removeAll(dupcharset);
			
			}
		for (Character character : charset) {
			if (character!=' ') {
				System.out.print(character);
			}
			
		} 
		
	}
		
	}
		 
        
    








	
