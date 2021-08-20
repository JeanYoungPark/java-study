package study;

import java.text.ChoiceFormat;
import java.text.MessageFormat;

public class ElseFormat {
    public static void main(String[] args) {
        //choiceFormat
        //반드시 오름차순
        double[] limits = {60, 70, 80, 90};
        String[] grades = {"D", "C", "B", "A"};
        int[] scores = {100, 95, 88, 70, 52, 60, 70};

        ChoiceFormat form = new ChoiceFormat(limits, grades);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]+":"+form.format(scores[i]));
        }

        //messageFormat
        //insert 구문에 사용하기도 한다.
        String msg = "Name: {0} \nTel: {1} \nAge:{2} \nBirthday:{3}";
        Object[] arguments = {
                "박진영", "02-123-1234", "27", "07-09"
        };
        String result = MessageFormat.format(msg, arguments);
        System.out.println(result);
    }
}
