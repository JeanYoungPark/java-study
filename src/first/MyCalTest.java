package first;

public class MyCalTest {

	public static void main(String[] args) {
		Calculator cal = new Mycal();
		cal.plus(3, 4);
		int i = cal.exec(5, 6);
		System.out.println(i);
		
		//�������̽���.�޼ҵ��()  �� ���̷νḸ ��밡��
		Calculator.exec2(3, 4);
	}

}
