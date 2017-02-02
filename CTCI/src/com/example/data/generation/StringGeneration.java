package com.example.data.generation;

public class StringGeneration {

	public static String longStringLastCharUnique() {
		char[] chars = new char[65537];
		char curr = '\u0000';
		for(int i = 0; i < chars.length; i++) {
			chars[i] = curr;
			if(curr != Character.MAX_VALUE) {
				curr++;
			}
		}
		return String.valueOf(chars);
	}
	
}
