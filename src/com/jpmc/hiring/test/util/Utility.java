/**
 * 
 */
package com.jpmc.hiring.test.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <h1>Utility</h1>
 * <p>Utility class providing various utility functions</p>
 * 
 * @author Anand
 * @version 1.0
 * @since July 21 2018
 * 
 * 
 */
public class Utility {

	/*
	 * 
	 * 
	 */
	/* This method perform Date formating function using SimpleDateFormate
	 * @return String
	 * @param Date date
	 *
	 */
	public static String dateFormater(Date date) {

		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-YYYY");
		String fdate = dateformat.format(date);

		return fdate;
	}

	/*
	 * Formatting double value upto 2 decimal places
	 */
	/*
	 * @return double
	 * @param double d
	 *
	 */
	
	public static double roundTwoDecimals(double d) {
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		return Double.valueOf(twoDForm.format(d));
	}

	/*
	 * get day based on the weekday
	 */
	/*
	 * @return String
	 * @param int i
	 *
	 */
	
	public static String findday(int i) {
		// TODO Auto-generated method stub
		String s = "";
		// sun mon tue wed thu fri sat
		// 1 2 3 4 5 6 7

		switch (i) {
		case 1:
			s = "Sunday";
			break;

		case 2:
			s = "Monday";
			break;

		case 3:
			s = "Tuesday";
			break;
		case 4:
			s = "Wedday";
			break;
		case 5:
			s = "Thursday";
			break;
		case 6:
			s = "Friday";
			break;
		case 7:
			s = "Saturday";
			break;
		default:
			s = "none";

		}
		return s;
	}

}
