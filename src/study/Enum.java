package study;

import java.io.IOException;
import java.util.Calendar;

public class Enum {

    //첫문자는 대문자로 (관례)
    public enum Week{
        //열거 상수는 모두 대문자 (관례)
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args)throws IOException{

        //사용 && 열거 객체의 메소드
        //Week today = Week.MONDAY;
        //String name = today.name();
        //int ordinal = today.ordinal();

        //Week day1 = Week.SATURDAY;
        //Week day2 = Week.SUNDAY;
        //int result1 = day1.compareTo(day2);
        //int result2 = day2.compareTo(day1);

        //Week weekDay = Week.valueOf("SATURDAY");

//        Week[] days = Week.values();
//        for (Week day : days) {
//            System.out.println(day);
//        }

        //true
        //boolean t = today == Week.SUNDAY;

        //열거상수 대입
        Week today = null;

        Calendar cal = Calendar.getInstance();
        //일~토까지의 숫자를 리턴
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1:
                today = Week.SUNDAY; break;
            case 2:
                today = Week.MONDAY; break;
            case 3:
                today = Week.TUESDAY; break;
            case 4:
                today = Week.WEDNESDAY; break;
            case 5:
                today = Week.THURSDAY; break;
            case 6:
                today = Week.FRIDAY; break;
            case 7:
                today = Week.SATURDAY; break;
        }

        System.out.println("오늘 요일: "+today);

        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 잡니다.");
        }else {
            System.out.print("공부합시다.");
        }
    }
}
