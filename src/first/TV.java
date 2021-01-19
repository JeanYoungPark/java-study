package first;

public interface TV {
	//final 키워드 없어도 상수와 같이 사용가능
	public int MIN_VOLUMN = 0;
	public int MAX_VOLUMN = 100;
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volumn);
	public void changeChannel(int channel);
}
