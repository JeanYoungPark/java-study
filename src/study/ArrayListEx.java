package study;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1, 4));

        //정렬
        Collections.sort(list1);
        Collections.sort(list2);

        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); //정해진 인덱스에 값 추가
        list2.set(3, "AA"); //정해진 인덱스에 값 덮어쓰기

        //list2에서 list1에 포함된 객체들을 삭제
        for (int i = 0; i < list2.size(); i++) {
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }

        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();

        List list = new ArrayList(length / LIMIT + 10);

        for (int i = 0; i < length; i += LIMIT) {
            if (i + LIMIT < length) {
                list.add(source.substring(i, i + LIMIT));
            }else {
                list.add(source.substring(i));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
