package outputst;

	import java.io.FileInputStream;
import java.io.FileOutputStream;
	import java.io.IOException;

	public class OutputStreamMain {

		public static void main(String[] args) {
			FileOutputStream fos = null;
			FileInputStream fis = null;
			
			try {
				//fos = new FileOutputStream("./0222byte.txt");//���ܰ� �߻��� ���ɼ��� �ִ� ����, ���� ������Ʈ ���丮�� ������ ����
				
				//byte [] ar = {97, 98, 99, 100, 101};
			//	String str = "�ȳ��ϼ���";
			//	fos.write(str.getBytes());//���ڿ��� ����Ʈ �迭�� ��ȯ�ؼ� ��� getBytes �̿�- �߿�
			//	fos.write(97);//���� �� 1����Ʈ ���
				
				/*byte [] b = new byte[4];
				fis.read(b);
				System.out.println(b);
				fis.flush();//������ ������ ����*/
				while(true){
				byte [] b = new byte[4];
				int r = fis.read(b);
				for(byte imsi : b) {
					System.out.println(imsi);
					if(r<=0) {break;}
				}
				}
				
				
			}catch(Exception e) {System.out.println("���� ����� ����: " + e.getMessage());}
			
			finally {
			try {
				//if( fis != null)
				if(fis != null) {
				//fos.close();
					fis.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			
		}

	}



