package study;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        File[] fileArr = {new File("Ex.java"), new File("Ex.bak"), new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")};

        Stream<File> fileStream = Stream.of(fileArr);

        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);

        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)
                .filter(s -> s.indexOf(".") != -1) //확장자가 없는것 제외
                .map(s -> s.substring(s.indexOf('.')+1))  //확장자만 추출
                .map(String::toUpperCase) //대문자로 변환
                .distinct() //중복제거
                .forEach(System.out::println);

//        System.out.println();
    }
}
