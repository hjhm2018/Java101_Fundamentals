import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class DateManipulation {

	static Date date = new Date();

	/**
	 * Method that shows date in AM-PM format
	 */

	static public void displayDateAM_PM() {

		String strDateFormat = "HH:mm:ss a";

		SimpleDateFormat todaysDate = new SimpleDateFormat(strDateFormat);

		System.out.println(todaysDate.format(date));
	}

	/**
	 * Method that shows the three different month formats
	 */

	static public void monthFormat() {
		Formatter monthFormatter = new Formatter();
		Calendar monthCalendar = Calendar.getInstance();
		monthFormatter.format("%tB %tb %tm", monthCalendar, monthCalendar, monthCalendar);
		System.out.println(monthFormatter);
	}

	/**
	 * Method that shows date in hours and minutes
	 */

	static public void hourAndMinutes() {
		Formatter hoursAndMinutesFm = new Formatter();
		Calendar MHcal = Calendar.getInstance();
		hoursAndMinutesFm.format("%tl:%tM", MHcal, MHcal);
		System.out.println(hoursAndMinutesFm);
	}

	/**
	 * Method that shows the current date and time
	 */

	static public void currentDateAndTime() {
		Formatter dateTime = new Formatter();
		Calendar dateTimeCalendar = Calendar.getInstance();
		dateTime.format("%tc", dateTimeCalendar);
		System.out.println(dateTime);
	}

	/**
	 * Method that shows the time in 24 and 12-hour format
	 */

	static public void date24And12() {
		Date date24And12 = new Date();
		SimpleDateFormat sdf12h = new SimpleDateFormat("h");
		SimpleDateFormat sdf24h = new SimpleDateFormat("H");
		System.out.println("Hour in 12h format is : " + sdf12h.format(date24And12));
		System.out.println("Hour in 24h format is : " + sdf24h.format(date24And12));
	}

	/**
	 * Method that shows the current date in MMMMM format
	 */

	static public void dateMMMFormat() {
		Date dateMMMFormat = new Date();
		SimpleDateFormat sdfMMM = new SimpleDateFormat("MMMM");
		System.out.println("Current Month in MMMM format : " + sdfMMM.format(dateMMMFormat));
	}

	/**
	 * Method that shows the time in seconds
	 */

	static public void timeSeconds() {
		Date dateSeconds = new Date();
		SimpleDateFormat sdfSeconds = new SimpleDateFormat("ss");
		System.out.println("Seconds in ss format : " + sdfSeconds.format(dateSeconds));

	}

	/**
	 * Method that shows the name of the weekdays
	 */

	static public void weekdays() {
		String[] weekdays = new DateFormatSymbols().getWeekdays();

		for (int i = 2; i < (weekdays.length - 1); i++) {
			String weekday = weekdays[i];
			System.out.println("Weekday: " + weekday);
		}
	}

	/**
	 * Method to add time to date
	 */

	static public void addTimeToDate() {
		Date d1 = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d1);
		System.out.println("Today is " + d1.toString());
		calendar.add(Calendar.MONTH, 2);
		System.out.println("Date 2 months later will be " + calendar.getTime().toString());
		calendar.add(Calendar.HOUR, 80);
		System.out.println("Date 7 hrs later will be " + calendar.getTime().toString());
		calendar.add(Calendar.YEAR, 5);
		System.out.println("Date 5 years later will be " + calendar.getTime().toString());
	}

	/**
	 * Method to display time in different countries
	 */

	static public void timeCountries() {
		Date d1 = new Date();
		System.out.println("Today is " + d1.toString());
		Locale locJapanese = new Locale("jp", "jp");
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locJapanese);
		System.out.println("Today is in Japanese Language and Format : " + df.format(d1));
	}

	/**
	 * Method to display time in different languages
	 */

	static public void timeLanguages() {
		Date d1 = new Date();
		System.out.println("Today is " + d1.toString());
		Locale locSpanish = new Locale("es");
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locSpanish);
		System.out.println("Today is in spanish: " + df.format(d1));
	}

	/**
	 * Method to roll through hours and months
	 */

	static public void hoursAndMonths() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date);
		System.out.println("Today is " + date.toString());

		calendar.roll(Calendar.MONTH, 300);
		System.out.println("Date after 3 months will be " + calendar.getTime().toString());

		calendar.roll(Calendar.HOUR, 80);
		System.out.println("Date after 7 hrs will be " + calendar.getTime().toString());
	}

	/**
	 * Method to find which week of the year
	 */

	static public void weekOfYear() {
		Date date1 = new Date();
		Calendar calendarWeek = Calendar.getInstance();
		calendarWeek.setTime(date1);

		System.out.println("Today is " + calendarWeek.WEEK_OF_YEAR + " week of the year");
	}

	/**
	 * Method to display time in different formats
	 */

	static public void timeFormats() {
		Date dt = new Date(1000000000000L);
		DateFormat[] dateformat = new DateFormat[6];

		dateformat[0] = DateFormat.getInstance();
		dateformat[1] = DateFormat.getDateInstance();
		dateformat[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dateformat[3] = DateFormat.getDateInstance(DateFormat.FULL);
		dateformat[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dateformat[5] = DateFormat.getDateInstance(DateFormat.SHORT);

		for (DateFormat dateform : dateformat)
			System.out.println(dateform.format(dt));
	}

	public static void main(String[] args) {

		displayDateAM_PM();
		monthFormat();
		hourAndMinutes();
		currentDateAndTime();
		date24And12();
		timeCountries();
		timeLanguages();
		hoursAndMonths();
		weekOfYear();
		timeFormats();

	}

}
