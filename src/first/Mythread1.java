package first;

public class Mythread1 extends Thread {

	String str;
	public Mythread1(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println(str);
			
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
