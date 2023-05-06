package com.hackertest;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12:01:00 AM";
		
		String result = Result2.timeConversion(s);
		System.out.println("time>>"+result);
	}

	
}

class Result2 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    	String result =                                       // Text representing the value of our date-time object.
    		    LocalTime.parse(                                  // Class representing a time-of-day value without a date and without a time zone.
    		        s ,                                  // Your `String` input text.
    		        DateTimeFormatter.ofPattern(                  // Define a formatting pattern to match your input text.
    		            "hh:mm:ss a" ,
    		            Locale.US                                 // `Locale` determines the human language and cultural norms used in localization. Needed here to translate the `AM` & `PM` value.
    		        )                                             // Returns a `DateTimeFormatter` object.
    		    )                                                 // Return a `LocalTime` object.
    		    .format( DateTimeFormatter.ofPattern("HH:mm:ss") )   // Generate text in a specific format. Returns a `String` object.
    		;
    	return result;

    }

}
