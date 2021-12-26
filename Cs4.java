package com.sangamone.projects1;

import java.util.*;

public class Cs4 {
	String word1;
	public String word2;
	public String fn_reverse(String word1){
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
		Cs4 obj = new Cs4();
		result=obj.fn_reverse( "FunwithProgramming");
		System.out.println(result);
		result=obj.fn_reverse( "FunwithProgrammingusingPython");
		System.out.println(result);
	}
}
