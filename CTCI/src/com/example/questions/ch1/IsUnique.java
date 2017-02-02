package com.example.questions.ch1;

import java.util.HashMap;

import com.example.data.generation.StringGeneration;

/**
 * Implement an algorithm to see if a string has all unique characters. What if
 * you cannot use additional data structures?
 * 
 * @author Gautham
 *
 */
public class IsUnique {

	public static void main(String[] args) {
		String data = StringGeneration.longStringLastCharUnique();
		System.out.println(isUniqueUsingArray(data));
	}
	
	
	public static boolean isUniqueUsingArray(String input) {
		
		// This allocates a new array (so memory hit...)
		char[] chars = input.toCharArray();
		
		// Java char type is a 16-bit unicode character
		// that can have max-value fo 65535.
		boolean[] flags = new boolean[65536];
		
		// Iterate until we stop or we find a duplicate
		for(int i = 0; i < chars.length; i++) {
			char c = chars[i];
			System.out.println(Integer.valueOf(c));
			if(flags[c]) {
				System.out.println("duplicate at index: " + i);
				return false;
			}
			flags[c] = true;
		}
		
		// If we got through without duplicates, return true
		return true;
		
		
	}

	
	
}
