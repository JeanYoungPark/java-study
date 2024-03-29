package study;

import java.util.ArrayList;

public class GenericsEx2 {
    static class Fruit implements Eatable {
        public String toString () { return "Fruit"; }
    }
    static class Apple extends Fruit {public String toString() { return "Apple"; }}
    static class Grape extends Fruit {public String toString() { return "Grape"; }}
    static class Toy {public String toString() { return "Toy"; }}

    static interface Eatable {}

    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();

//        FruitBox<Grape> grapeBox = new FruitBox<Apple>(); 에러 타입 불일치
//        FruitBox<Toy> toyBox = new FruitBox<>; 에러

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
//        appleBox.add(new Grape()); 에러 grape는 apple의 자손이 아
        grapeBox.add(new Grape());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }

    static class FruitBox<T extends Fruit & Eatable> extends Box<T>{}
    //제네릭 클래스
    static class Box<T> {
        ArrayList<T> list = new ArrayList<>();
        void add(T item) { list.add(item); }
        T get(int i) { return list.get(i); }
        int size() { return list.size(); }
        public String toString () { return list.toString(); }
    }
}
