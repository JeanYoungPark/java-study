package first;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			try {
				System.out.println("b�� �Ϸ�ɶ����� ��ٸ��ϴ�.");
				//��ٷ���
				b.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Total : "+b.total);
		}
	}
}
