package study;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTimePackage {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        //of : set 해준다.
        LocalDate birthDate = LocalDate.of(1999, 12, 31);
        LocalTime birthTime = LocalTime.of(23, 59, 59);

        System.out.println(birthDate.withYear(2000));
        System.out.println(birthDate.plusDays(1));
        System.out.println(birthDate.plus(1, ChronoUnit.DAYS));

        //23:59:59 -> 23:00
        System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));

        //period(날짜), duration(시간)
        LocalDate date1 = LocalDate.of(2014, 1, 1);
        LocalDate date2 = LocalDate.of(2015, 12, 31);

        Period pe = Period.between(date1, date2);

        LocalTime time1 = LocalTime.of(00, 00, 00);
        LocalTime time2 = LocalTime.of(12, 34, 56);

        Duration du = Duration.between(time1, time2);

        //불러올 수 있는 메서드
        System.out.println(pe.getUnits()); //[Years, Months, Days]
        System.out.println(du.getUnits()); //[Seconds, Nnos]

        //특히 duration에서 쉽게 시,분을 불러오기가 힘들다. 그래서 아래 방법을 사용
        LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
        int hour = tmpTime.getHour();
        int minute = tmpTime.getMinute();

        //날짜 출력
        String yyyymmdd = today.format(DateTimeFormatter.ISO_LOCAL_DATE); //정의되어 있는 형식 중 하나
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd"); //사용자 직접 정의

        //문자열을 날짜와 시간으로 파싱
        LocalDate newDate = LocalDate.parse("2022-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate date = LocalDate.parse("2001-01-01");
        LocalTime time = LocalTime.parse("23:59:59");
    }
}
