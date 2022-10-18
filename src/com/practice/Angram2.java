package com.practice;

import java.util.Arrays;

public class Angram2 {

	public static void main(String[] args) {
		
		String str="keep";
		String stra="Peek";
		boolean	status=false;
		if(str.length()!=stra.length()) {
			
		}else {
		char arr1[]=str.toLowerCase().toCharArray();
		char arr2[]=stra.toLowerCase().toCharArray();
	
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		status=Arrays.equals(arr1, arr2);
		}	
		if(status==true) {
			System.out.println("The given strings are anagram"); 
		}else {
			System.out.println("The given strings are not anagram");
		}
	}

}
