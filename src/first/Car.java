package first;

public class Car {
	//학업 필드명
	String name;
	int number;
	
	//생성자
	public Car(String name) {
		this.name = name;
	}
	
	//생성자 오버로딩
	public Car() {
//		this.name = "이름없음";
//		this.number = 0;
		this("이름없음",0);
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void run() {
		System.out.println("달리다");
	}
}

