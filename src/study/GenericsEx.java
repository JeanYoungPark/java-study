package study;

import java.util.ArrayList;

public class GenericsEx {
    static class Fruit { public String toString() {return "Fruit";} }
    static class Apple extends Fruit { public String toString() {return "Apple";} }
    static class Grape extends Fruit { public String toString() {return "Grape";} }
    static class Toy { public String toString() {return "Toy";} }

    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>(); //Box<Fruit> fruitBox = new Box<Fruit>(); jdk1.7부터 생략가능
        Box<Apple> appleBox = new Box<>();
        Box<Toy> toyBox = new Box<>();
//        Box<Grape> grapeBox = new Box<Apple>(); 에러

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        appleBox.add(new Apple());
//        appleBox.add(new Toy()); 에러

        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }

    //제네릭 클래스
    static class Box<T> {
        ArrayList<T> list = new ArrayList<>();
        void add(T item) { list.add(item); }
        T get(int i) { return list.get(i); }
        int size() { return list.size(); }
        public String toString () { return list.toString(); }
    }
}
