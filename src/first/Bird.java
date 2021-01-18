package first;

//메소드가 하나라도 추상일 경우 클래스도 추상
public abstract class Bird {
	public abstract void sing();
	public void fly(){
		System.out.println("날다.");
	}
}
