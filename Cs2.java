package com.sangamone.projects1;

import java.util.*;

public class Cs2 {
	public static void main(String[] args) {
		String s1 = "FunwithProgramming";
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
		System.out.println(s2);
		System.out.println(s3);
	

	}

}
