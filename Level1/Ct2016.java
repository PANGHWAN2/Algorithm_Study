package Level1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ct2016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=24;
		Ct2016 ct = new Ct2016();
		System.out.println(ct.solution1(a,b));
	}


	public String solution1(int a, int b) {
		Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, a - 1, b).build();
		return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
	}

	public String solution2(int a, int b) {
		String answer = "";
		Calendar cal = Calendar.getInstance();
		cal.set(2016, a - 1, b);
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.ENGLISH);

		answer = sdf.format(date).toUpperCase();
		return answer;
	}

	public String solution3(int a, int b) {
		String answer = "";
		String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int allDate = 0;
		for (int i = 0; i < a - 1; i++) {
			allDate += date[i];
		}

		allDate += (b - 1);
		answer = day[allDate % 7];

		return answer;
	}

}
