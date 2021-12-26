package com.sangamone.projects1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Cs6 {
	public static void main(String[] args) {
		ZoneId india = ZoneId.of("Asia/Kolkata");
		System.out.println(india);
		String str = "2021-05-03 17:00";
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime ldt = LocalDateTime.parse(str,fmt);
		ZonedDateTime time_utc1 = ZonedDateTime.of(ldt, india);
		//ZonedDateTime time_utc2 = time_utc1.withZoneSameInstant(ZoneOffset.UTC);
		//System.out.println("India "+"str");
		System.out.println("UTC "+time_utc1.toString());
		//System.out.println("UTC "+time_utc1.toString());
	}

}




