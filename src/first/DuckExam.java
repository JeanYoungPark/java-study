package first;

public class DuckExam {

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sing();
		duck.fly();
		
		//추상클래스는 객체로서 생성할 수 없다.
		//Bird bird = new Bird();
	}

}
