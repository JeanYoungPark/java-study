package first;

public class StringExam {

	public static void main(String[] args) {
		//상수형으로 값이 만들어지고 str1과 str2가 같은 위치를 가르키게 된다.
		String str1 = "hello";
		String str2 = "hello";
		
		//각각의 메모리 힙에 저장이 된다.
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		if(str1 == str2)
			System.out.println("1");
		
		if(str1 == str3)
			System.out.println("2");
		
		if(str3 == str4)
			System.out.println("3");
		
		System.out.println(str1.substring(3));
	}

}
