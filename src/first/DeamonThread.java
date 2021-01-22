package first;

public class DeamonThread implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("���󾲷��尡 �������Դϴ�.");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new DeamonThread());
		thread.setDaemon(true);
		thread.start();
		
		try {
			thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("����");
	}

}
