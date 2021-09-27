public class Time {
	
	public static void main(String[] args) {
		int hour = 14;
		int minute = 50;
		int second = 25;
		final int HOUR_IN_DAY = 24;
		final int SECOND_IN_MINUTE = 60;
		final int MINUTE_IN_HOUR = 60;
		final int SECOND_IN_DAY = 24 * SECOND_IN_MINUTE * MINUTE_IN_HOUR;
		int secondsSinceMidnight = second + minute * SECOND_IN_MINUTE + hour * MINUTE_IN_HOUR * SECOND_IN_MINUTE;
		int secondsRemaining = SECOND_IN_DAY - secondsSinceMidnight;
		float percentOfDayPassed = ((float) secondsSinceMidnight) / ((float) SECOND_IN_DAY);
		System.out.println("Seconds since midnight: " + secondsSinceMidnight);
		System.out.println("Seconds remaining: " + secondsRemaining);
		System.out.println("Percent of day passed: " + percentOfDayPassed * 100);
	}
	
}