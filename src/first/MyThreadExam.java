package first;

public class MyThreadExam {

	public static void main(String[] args) {
		Mythread1 t1 = new Mythread1("*");
		Mythread1 t2 = new Mythread1("-");
		
		//���μҽ��ڵ尡 �帣�� �帧�� t1�� �帣�� �帧���� ������.
		t1.start();
		t2.start();
		
		System.out.println("��");
	}

}
