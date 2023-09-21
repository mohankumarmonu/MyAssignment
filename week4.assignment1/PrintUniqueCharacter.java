package week4.day1.assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "mohankumar";
		char[] charArray = name.toCharArray();
		Set<Character> set = new HashSet<>();
		for (char c : charArray ) {
			// Check if the character is not already in the Set
			if (!set.contains(c)) {
				
			}
			set.add(c);
			
		}
		for (Character each : set) {
			System.out.println(each+ " ");
			
		}
			
			
		}

	}



/*
// * Psuedocode

 //* a) Convert String to Character array
// * b) Create a new Set -> HashSet
 * c) Add each character to the Set and if it is already there, remove it
 * d) Finally, print the set
 * 
 */