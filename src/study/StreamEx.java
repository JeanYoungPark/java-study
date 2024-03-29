package study;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("이서방",3,300),
                new Student("박서방",1,200),
                new Student("최서방",2,100),
                new Student("김서방",2,150),
                new Student("한서방",1,200),
                new Student("안서방",3,290)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan) //반별로 정렬
                .thenComparing(Comparator.naturalOrder())) //기본 정렬
                .forEach(System.out::println);
    }

    static class Student implements Comparable<Student> {
        String name;
        int ban;//반
        int totalScore;

        public Student(String name, int ban, int totalScore) {
            this.name = name;
            this.ban = ban;
            this.totalScore = totalScore;
        }

        public String toString() {
            return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
        }

        String getName() {return name;}
        int getBan() {return ban;}
        int getTotalScore() { return totalScore; }

        //총점 내림차순을 기본 정렬
        public int compareTo(Student s) {
            return s.totalScore - this.totalScore;
        }
    }

}
