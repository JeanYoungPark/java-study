package first;

public class CarExam {

	public static void main(String[] args) {
		//������, new = Ŭ������ �޸𸮿� �÷���..
		//c1, c2�� �޸𸮿� �ö�� new Car()�� ��ġ ���� ����Ǿ�����.
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.name = "�ҹ���";
		c1.number = 119;
		
		c2.name = "������";
		c2.number = 112;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
	}

}
