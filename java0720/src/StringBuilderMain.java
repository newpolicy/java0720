import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringBuilderMain {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("./FileWriter.txt"));
			StringBuilder sb = new StringBuilder();
			while(true) {
				String line = br.readLine(); //한줄 읽기
				if(line == null) {  //읽은 데이터가 없으면 종료
					break;
				}
				sb.append(line);
			    String content =  sb.toString();//읽은 내용을 String에 저장하기
			    sb = null; // 메모리 정리를 위해
			    System.out.println(content);
			}
		}catch(Exception e) {
			
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
