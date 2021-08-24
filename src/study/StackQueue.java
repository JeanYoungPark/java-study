package study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("0"); //객체 저장
        st.push("1");
        st.push("2");

        q.offer("0"); //객체 저장, 성공하면 true, 실패하면 false
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack =");
        while (!st.empty()) {
            System.out.println(st.pop()); //맨뒤에 저장된 객체 꺼낸다
        }

        System.out.println("= Queue =");
        while (!q.isEmpty()) {
            System.out.println(q.poll()); //객첼ㄹ 꺼내서 반환 비어있으면 null
        }
    }
}
