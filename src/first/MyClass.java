package first;

public class MyClass {
	//public 리턴타입 메소드명 (매개변수들) {구현}
	public void method1() {
		System.out.println("void");
	}
	
	public void method2(int x) {
		System.out.println(x);
	}
	
	public int method3 () {
		System.out.println("3실행");
		return 3;
	}
	
	public void method4(int x, int y) {
		System.out.println(x+"와"+y);
	}
	
	public int method5(int x) {
		return x;
	}
}
