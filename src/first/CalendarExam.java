package first;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		//calendar�� �߻� Ŭ���� 
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		
		cal.add(Calendar.HOUR, 5);
		
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
	}

}
