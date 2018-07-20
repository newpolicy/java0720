package printstreams;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			ps = new PrintStream(new FileOutputStream(".liptalkdata.txt"));
			ps.print("Welcome to the Lip Talk");
			ps.println(" HI");
			ps.flush();
	
				
			
	 		
		}catch(Exception e){
			System.out.println("���� ���� ����" + e.getMessage());
		}
		finally {
			if(ps != null) {
			ps.close();
			}
		}
		

	}

}
