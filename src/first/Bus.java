package first;

public class Bus extends Car {
	
	//오버라이딩
	public void run() {
		//부모의 메소드도 호출하고 싶을떄
		super.run();
		System.out.println("Bus의 run메소드");
	}
	
	public void ppangppang() {
		System.out.println("빵빵");
	}
}
