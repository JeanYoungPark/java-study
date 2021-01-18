package first;

public class Truck extends Car2 {
	public Truck() {
		//부모의 생성자를 부르는 일
		super("소방차");
		System.out.println("Truck 기본 생성자입니다.");
	}
}
