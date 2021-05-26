package study;

import java.io.IOException;

public class For {
    public static void main(String[] args)throws IOException{
        int[] scores = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        System.out.print(sum);
    }
}
