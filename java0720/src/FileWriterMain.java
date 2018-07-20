import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("./FileWriter.txt");
			fw.write("hi ");
			fw.write("hi hello ");
			fw.write("hi hello welcome ");
			fw.write("hi hello welcome Whats up ");
				
			
		}catch(Exception e){
			System.out.println("기록 예외 " + e.getMessage());
		}finally {
			try {
				if(fw != null) {
				fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
