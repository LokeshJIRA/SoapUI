package Testing;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {


		Calendar cal=Calendar.getInstance();
		Date d=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("M/dd/yyyy");
		
		
		System.out.println(sd.format(cal.getWeeksInWeekYear()));
	}

}
