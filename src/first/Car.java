package first;

public class Car {
	//�о� �ʵ��
	String name;
	int number;
	
	//������
	public Car(String name) {
		this.name = name;
	}
	
	//������ �����ε�
	public Car() {
//		this.name = "�̸�����";
//		this.number = 0;
		this("�̸�����",0);
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void run() {
		System.out.println("�޸���");
	}
}

