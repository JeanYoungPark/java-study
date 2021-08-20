package study;

import java.io.IOException;
import java.text.DecimalFormat;

public class DecimalFormatEx {
    public static void main(String[] args) throws IOException {
        //java api문서에서 데시말포맷 찾아보면 기호가 있다.
        double number = 1234567.89;
        String[] pattern = {
                "0",
                "#",
                "0.0",
                "#.#",
                "0000000000.0000",
                "##########.####",
                "#.#-",
                "-#.#"
        };

        for (int i = 0; i < pattern.length; i++) {
            DecimalFormat df = new DecimalFormat(pattern[i]);
            System.out.printf("%s : %s\n", pattern[i], df.format(number));
        }
    }
}
