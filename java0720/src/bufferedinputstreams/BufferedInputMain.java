package bufferedinputstreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputMain {

	public static void main(String[] args) {
		BufferedInputStream  bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("C:\\Day Purpose.PNG"));
			while(true) {
				byte [] b = new byte[1024];
				int r = bis.read(b); //1024byte 단위로 읽어내기
				System.out.println(new String(b));
				if(r <= 0) {
					break;
				}
			}
		}
		catch( Exception e) {
			
		}
		finally {
			try {
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
