package first;

public interface Calculator {
	public int plus(int x, int y);
	public int mutiple(int x, int y);
	
	//default 키워드와 사용시 메소드 구현 가능
	//생긴 이유 : 인터페이스를 사용할 경우 해당 인터페이스에서 만든 메소드를 무조건 구현해야함으로... 
	default int exec(int i, int j) {
		return i+j;
	};
	
	public static int exec2(int i, int j) {
		return i * j;
	}
}
