package first;

public class InnerExam3 {
	public void exec() {
		class Cal{
			int value = 0;
			public void plus() {
				value++;
			}
		}
		//메서드 안에서 생성된 클래스는 메서드 안에서만 사용 가능
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	}
	
	public static void main(String[] args) {
		InnerExam3 t = new InnerExam3();
		t.exec();
	}

}
