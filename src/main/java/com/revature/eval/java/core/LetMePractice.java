package com.revature.eval.java.core;

import java.util.Arrays;

public class LetMePractice {
	
	public static void main(String[] args) {
		String string= "(223) 456-7890";
		
		String cleanNumba =string.replaceAll("\\s", "");
		char[] replcVal="[()+.-?@]".toCharArray();
		System.out.println(Arrays.toString(replcVal));
		for(char x: replcVal) {
			cleanNumba =cleanNumba.replaceAll("\\"+String.valueOf(x), "");			  
		}	
		
		//char[] validNumba =cleanNumba.toCharArray();
		String invalid = "This is not a correct format";
		System.out.println(cleanNumba);
		
		if (cleanNumba.length() == 10 ) {
			System.out.println(cleanNumba);}			
		//else  
			//throw new IllegalArgumentException(invalid);
	}

}

		
		
//		String numba = "(316)7899899123";
//		String cleanNumba =numba.replaceAll("[()+.-]", "");
//		char[] validNumba =cleanNumba.toCharArray();
//		
//		if (validNumba.length == 10 ) {
//			System.out.println(cleanNumba);
//		} else 
//			System.out.println("Nope"); 
			
//	}
	
//	char[] onePoint = {'A','E','I','O','U','L','N','R','S','T'};
//	char[] twoPoint = {'D','G'};
//	char[] threePoint = {'B','C','M','P'};
//	char[] fourPoint = {'F','H','V','W'};
//	char[] fivePoint = {'K'};
//	char[] eightPoint = {'J','X'};
//	char[] tenPoint = {'Q','V'};
//	
//	
//	
//	
//	for(int x=0; x<word.length; x++) {
//		
//	char [] a = word;
//	
//	if (word.charAt(x) == onePoint) {
//		
//	}
//	
//	
//		
//	}
//
//	public static void main(String[] args) {
//		
//	}
