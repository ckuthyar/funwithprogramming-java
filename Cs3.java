package com.sangamone.projects1;

import java.util.*;

public class Cs3 {
	String word1;
	static String word2;
	static String fn_reverse(String word1){
		String s1 = word1;
		String s2="";
		String s3="";
		String[] list1;
		int len1;
		list1 = s1.split("");
		len1 = list1.length;
		for (int i = 0; i < len1; i++) {
			s2=s2+list1[i];
		}
		for (int i=0; i<len1; i++) {
			s3=s3+list1[len1-1-i];
		}
		word2=s3;
		return word2;
	}
	public static void main(String[] args) {
		String result;
		result=fn_reverse( "FunwithProgramming");
		System.out.println(result);
		result=fn_reverse( "FunwithProgrammingusingPython");
		System.out.println(result);
	}
}
