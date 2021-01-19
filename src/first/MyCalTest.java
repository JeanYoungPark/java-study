package first;

public class MyCalTest {

	public static void main(String[] args) {
		Calculator cal = new Mycal();
		cal.plus(3, 4);
		int i = cal.exec(5, 6);
		System.out.println(i);
		
		//인터페이스명.메소드명()  과 같이로써만 사용가능
		Calculator.exec2(3, 4);
	}

}
