package first;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteExam2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/first/ByteExam1.java");
			fos = new FileOutputStream("byte.txt");
			
			//1바이트를 읽으라 해도 511바이트를 읽는다.그래서 512바이트를 읽으라 하면 시간이 줄어든다.
			int readCount = -1;
			byte[] buffer = new byte[512];
			while((readCount = fis.read(buffer)) != -1) {
				fos.write(buffer,0,readCount);
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
