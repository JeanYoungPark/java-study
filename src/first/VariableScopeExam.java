package first;

public class VariableScopeExam {
	int globalScope = 10;
	
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		int localScope = 20;
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(value2);
	}
	
	//static 사용시 인스턴스화 하지 않아도 사용이 가능
	public static void main(String[] args) {
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(staticVal);
		
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		
		//값을 공유한다. 클래스 변수
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);
		
		//바람직한 방법
		System.out.println(VariableScopeExam.staticVal);
	}

}
