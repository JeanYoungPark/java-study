package first;

public class ActionExam {

	public static void main(String[] args) {
//		Action action = new MyAction();
//		action.exec();
		//한번만 사용하게 되는 추상클래스는 이렇게도 쓰인다.
		Action action = new Action() {
			
			@Override
			public void exec() {
				System.out.println("exec");
				
			}
		};
		action.exec();
	}

}
