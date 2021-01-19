package first;

public class ExceptionExam3 {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		try {
			int k = divide(x,y);
			System.out.println(k);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}
	
	public static int divide(int x, int y) throws IllegalArgumentException{
		if(y == 0) {
			throw new IllegalArgumentException("0���� ���� �� �����ϴ�.");
		}
		int k = x/y;
		return k;
	}

}
