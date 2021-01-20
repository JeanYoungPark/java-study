package first;

public class BoxExam {

	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj();
//		
//		//string은 Object 상속받았기 떄문에 사용이 가능하다.
//		box.setObj("hello");
//		String str= (String)box.getObj();
//		System.out.println(str);
//		
//		box.setObj(1);
//		int value = (int)box.getObj();
		
		//형변환이 필요없다.
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object boj = box.getObj();
		
		//무조건 스트링형만 받는다.
		Box<String> box2 = new Box<>();
		box2.setObj("hello");
		String str = box2.getObj();
		//무조건 인트형만 받는다.
		Box<Integer> box3 = new Box<>();
		box3.setObj(4);
		int v2 = box3.getObj();
	}

}
