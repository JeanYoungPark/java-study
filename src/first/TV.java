package first;

public interface TV {
	//final Ű���� ��� ����� ���� ��밡��
	public int MIN_VOLUMN = 0;
	public int MAX_VOLUMN = 100;
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volumn);
	public void changeChannel(int channel);
}
