package com.cdac.acts.EmployeeInheritance.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateUtil {

	private static final String FORMAT = "dd/MM/yyyy";
	private static final String EMPTY = "";
	
	private DateUtil()
	{
		// Do nothing Constructor to stop object Initialization
	}
	
	public static String getFormattedDate(Date date)
	{
		if(null == date)
		{
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		return sdf.format(date);
	}
	
	//this method takes input string and convert to date obj
	
	public static Date getDate(String strDate) throws ParseException{
		if( null == strDate || EMPTY.equals(strDate))
		{
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		Date date = sdf.parse(strDate);
		return date;
		
	}
	
}
