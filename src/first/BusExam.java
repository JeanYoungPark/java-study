package first;


public class BusExam {
		
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		bus.ppangppang();
		
		Car car = new Car();
		
		car.run();
//		car.ppangppang();
		
		//�θ��� ���븸 ��밡��
		Car c = new Bus();
		c.run();
//		c.ppangppang();
		
		Bus b = (Bus) c;
		b.run();
		b.ppangppang();
	}
	
}
