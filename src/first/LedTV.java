package first;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("�Ѵ�");
	}

	@Override
	public void turnOff() {
		System.out.println("����");
	}

	@Override
	public void changeVolume(int volumn) {
		System.out.println("������ �����ϴ�");
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("ä���� �ٲٴ�");
	}

}
