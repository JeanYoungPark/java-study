package first;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		int value = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			//반복할 문장
			value = scan.nextInt();
			System.out.println("입력받은값:"+value);
		}while(value != 10);
	}

}
