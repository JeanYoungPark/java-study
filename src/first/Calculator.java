package first;

public interface Calculator {
	public int plus(int x, int y);
	public int mutiple(int x, int y);
	
	//default Ű����� ���� �޼ҵ� ���� ����
	//���� ���� : �������̽��� ����� ��� �ش� �������̽����� ���� �޼ҵ带 ������ �����ؾ�������... 
	default int exec(int i, int j) {
		return i+j;
	};
	
	public static int exec2(int i, int j) {
		return i * j;
	}
}
