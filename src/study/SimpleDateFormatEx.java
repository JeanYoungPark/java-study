package study;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class SimpleDateFormatEx {
    public static void main(String[] args) {
        //java api 문서에서 simpledataformat
        Date today = new Date();

        SimpleDateFormat sdf1, sdf2, sdf3;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("yyyy-MM-dd일 HH:mm:ss E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        System.out.println(sdf1.format(today));
        System.out.println(sdf2.format(today));
        System.out.println(sdf3.format(today));

        //그 외 캘린더 -> 데이트로 변환
        Calendar cal = Calendar.getInstance();
        cal.set(2005, 9, 3);

        cal.getTime();

        //예제
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner sc = new Scanner(System.in);

        Date inDate = null;

        System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력예:2015/12/31)");

        while (sc.hasNext()) {
            try {
                inDate = df.parse(sc.nextLine());
                break;
            }catch (Exception e){
                System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(입력예:2015/12/31)");
            }
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inDate);
        Calendar to = Calendar.getInstance();
        long day = (calendar.getTimeInMillis() - to.getTimeInMillis()) / (60*60*1000);
        System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다.");
    }
}
