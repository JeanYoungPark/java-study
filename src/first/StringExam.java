package first;

public class StringExam {

	public static void main(String[] args) {
		//��������� ���� ��������� str1�� str2�� ���� ��ġ�� ����Ű�� �ȴ�.
		String str1 = "hello";
		String str2 = "hello";
		
		//������ �޸� ���� ������ �ȴ�.
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
