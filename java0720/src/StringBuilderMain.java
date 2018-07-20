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
				String line = br.readLine(); //���� �б�
				if(line == null) {  //���� �����Ͱ� ������ ����
					break;
				}
				sb.append(line);
			    String content =  sb.toString();//���� ������ String�� �����ϱ�
			    sb = null; // �޸� ������ ����
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
