package study;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
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

    }
}
