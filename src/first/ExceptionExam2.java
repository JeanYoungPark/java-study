package first;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		try{
			int k = divide(x,y);
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		
	}
	
	//ȣ���ϴ� �ʿ��� ���� ó�� = throws
	public static int divide(int x, int y) throws ArithmeticException{
		int k = x/y;
		return k;
	}

}
