package first;

public class InnerExam2 {
	static class Cal{
		int value = 0;
		public void Plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.Plus();
		System.out.println(cal.value);
	}

}
