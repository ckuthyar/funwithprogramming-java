package com.sangamone.com;

public class Cs9 {

	public static void main(String[] args) {
		String input1="Hello";
		String output1="";
		int len1=input1.length();
		output1=output1+input1.substring(len1-1, len1);
		output1=output1+input1.substring(len1-2, len1-1);
		output1=output1+input1.substring(len1-3, len1-2);
		output1=output1+input1.substring(len1-4, len1-3);
		output1=output1+input1.substring(len1-5, len1-4);		
		System.out.println(input1 + "-" + output1);
		// TODO Auto-generated method stub

	}

}
;;
