package ml.wzgy;

import java.util.Calendar;

@SuppressWarnings("unused")
class DateTime {
	private int year, month, day, hour, minute, second, weekday;

	public int getYear() {return year;}

	public int getMonth() {return month;}

	public int getDay() {return day;}

	public int getHour() {return hour;}

	public int getMinute() {return minute;}

	public int getSecond() {return second;}

	public int getWeekday() {return weekday;}

	DateTime(Calendar calendar) {
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH)+1;
		day = calendar.get(Calendar.DATE);
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		minute = calendar.get(Calendar.MINUTE);
		second = calendar.get(Calendar.SECOND);
		weekday = (calendar.get(Calendar.DAY_OF_WEEK)+5)%7+1;
	}
}