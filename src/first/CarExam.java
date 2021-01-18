package first;

public class CarExam {

	public static void main(String[] args) {
		//참조형, new = 클래스를 메모리에 올려라..
		//c1, c2는 메모리에 올라긴 new Car()의 위치 값이 저장되어있음.
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.name = "소방차";
		c1.number = 119;
		
		c2.name = "경찰차";
		c2.number = 112;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
	}

}
