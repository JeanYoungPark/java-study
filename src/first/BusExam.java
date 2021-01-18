package first;


public class BusExam {
		
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		bus.ppangppang();
		
		Car car = new Car();
		
		car.run();
//		car.ppangppang();
		
		//부모의 내용만 사용가능
		Car c = new Bus();
		c.run();
//		c.ppangppang();
		
		Bus b = (Bus) c;
		b.run();
		b.ppangppang();
	}
	
}
