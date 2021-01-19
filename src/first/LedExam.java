package first;

public class LedExam {

	public static void main(String[] args) {
		TV tv = new LedTV();
		tv.turnOn();
		tv.changeChannel(0);
		tv.changeVolume(0);
		tv.turnOff();
	}

}
