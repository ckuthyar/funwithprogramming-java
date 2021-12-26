package com.sangamone.projects1;

public class Cs8 {

	public static void main(String[] args) {
		int start_hrs=0;
		int end_hrs=23;
		int interval=15;
		for (int j=start_hrs; j<=end_hrs; j++) {
			for (int i=0;i<(60/interval);i++) {
				System.out.println(start_hrs + ":" + interval*i);
			}
			System.out.println();
			start_hrs=start_hrs+1;
		}
		
	
		// TODO Auto-generated method stub

	}

}
