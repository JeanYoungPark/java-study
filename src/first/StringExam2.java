package first;

public class StringExam2 {

	public static void main(String[] args) {
		String str1 = "hello world";
		String str2 = str1.substring(5);
		System.out.println(str1);
		System.out.println(str2);
		
		//+�� �׻� StringBuffer�� ����ϴ� ���̴�.
		String str3 = str1 + str2;
		System.out.println(str3);
		
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4);
		
		//X
		String str5 = "";
		for(int i = 0;i <100;i++) {
			str5 = str5 + "*";
		}
		System.out.println(str5);
		
		//O : new�� ����� ����Ͽ� ��ü�� ȣ���ϴ� �͵� ���Ϲ��� ���� �� ����(�ð��� �����ɸ�)
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 100; i++ ) {
			sb.append("*");
		}
		String str6 = sb.toString();
		System.out.println(str6);
	}

}
