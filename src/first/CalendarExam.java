package first;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		//calendar이 추상 클래스 
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		
		String str = new StringBuffer().append(year).append("년").append(month).append("월").append(date).append("일").toString();
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(str);
		
		cal.add(Calendar.HOUR, 5);
		
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
	}

}
