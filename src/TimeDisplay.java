
	/*************************************
	 *                                   *
	 * @author Brendan Shine             *
	 * Mr. Kiedes Period 2               *
	 * 9-17-15                           *
	 *                                   *
	 ************************************/
	// Lab03vst.java
	// Student starting version of the Lab03 assignment.
	// Resave this program as Lab03v80 for the 80 point version.
	// Resave this program as Lab03v100 for the 100 point version.


	public class TimeDisplay
	{
		public static void main(String[] args)
		{
			int time = 10000123; // 10,000 seconds to start, then 10000123 milliseconds
			int hours = time/3600000; //find hours
			int minutes = (time % 3600000)/60000; //find minutes
			int seconds = (((time % 3600000)% 60000)/1000); //find seconds
			int milliseconds = ((time % 3600000)% 1000); //find milliseconds
			System.out.println("Lab03, 80 Point Version\n");
			System.out.println();		
			System.out.println("Starting seconds:   " + time); //display starting seconds
			System.out.println("Hours:              " + hours); //display hours
			System.out.println("Minutes:            " + minutes); //display minutes
			System.out.println("Seconds:            " + seconds); // display seconds
			System.out.println("Milliseconds:       " + milliseconds); // display milliseconds
		}	
	}


