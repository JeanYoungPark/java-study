package study;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.temporal.TemporalAdjusters.*;

//제공되는 날짜는 temporalAdjuster메서드 확인
//기본으로 사용되는 날짜 외 자주 사용하는 날짜에 대하여 정의
class DayAfterTomorrow implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(2, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterEx {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new DayAfterTomorrow());

        p(today);
        p(date);
        p(today.with(firstDayOfNextMonth())); //다음 달의 첫날
        p(today.with(firstDayOfMonth())); //이 달의 첫 날
        //기타 내용은 문서확인
    }

    //라인수를 줄이기 위한 메서드
    static void p(Object obj) {
        System.out.println(obj);
    }
}
