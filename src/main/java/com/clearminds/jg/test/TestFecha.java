package com.clearminds.jg.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFecha {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String dateString = format.format( new Date()   );
		//Date   date       = format.parse ( "2009-12-31" );  
		
		
		System.out.println(dateString);
	}
}
