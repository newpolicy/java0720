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
				 
				fr.read(buf);//buf�� ũ�⸸ŭ �о buf�� �����ϰ�
				int r = fr.read(buf); //���� ������ r�� ����
				if(r<=0) {
					break;
					}
				System.out.print(buf);
				System.out.println(new String(buf, 0, r));// �迭���� 0��° ���� r��ŭ �� ���ڿ��� ��ȯ�ؼ� ���
				
			}
			
			
		}catch(Exception e) {
			System.out.println("����" + e.getMessage());
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
