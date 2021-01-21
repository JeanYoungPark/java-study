package first;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteExam1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/first/ByteExam1.java");
			fos = new FileOutputStream("byte.txt");
			
			int readData = -1;
			while((readData = fis.read()) != -1) {
				fos.write(readData);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
