package first;

public class MyThreadExam {

	public static void main(String[] args) {
		Mythread1 t1 = new Mythread1("*");
		Mythread1 t2 = new Mythread1("-");
		
		//메인소스코드가 흐르던 흐름과 t1이 흐르는 흐름으로 나뉜다.
		t1.start();
		t2.start();
		
		System.out.println("끝");
	}

}
