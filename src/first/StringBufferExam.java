package first;

public class StringBufferExam {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		//자기자신을 호출
		StringBuffer sb3 = sb2.append("hello");
		if(sb2 == sb3)
			System.out.println("같다");
		
		//메서드체이닝
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);
	}

}
