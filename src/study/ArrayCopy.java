package study;

import java.io.IOException;

public class ArrayCopy {
    public static void main(String[] args)throws IOException{
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        //배열복사 (원본배열, 시작인덱스, 새배열, 시작인댁스, 갯수)
        System.arraycopy(oldStrArray,0,newStrArray,0,oldStrArray.length);

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.println(newStrArray[i]);
        }
    }
}
