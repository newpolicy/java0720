import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("./FileWriter.txt");
			//char [] buf = new char [5];
			char [] buf = new char [5];
			/*for(char ch : buf) {
				System.out.print(ch);
			}*/
			while(true) {
				 
				fr.read(buf);//buf의 크기만큼 읽어서 buf에 저장하고
				int r = fr.read(buf); //읽은 개수를 r에 저장
				if(r<=0) {
					break;
					}
				System.out.print(buf);
				System.out.println(new String(buf, 0, r));// 배열에서 0번째 부터 r만큼 만 문자열로 변환해서 출력
				
			}
			
			
		}catch(Exception e) {
			System.out.println("예외" + e.getMessage());
		}finally {
			if(fr != null) {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}

	}

}
