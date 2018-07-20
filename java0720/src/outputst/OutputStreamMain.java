package outputst;

	import java.io.FileInputStream;
import java.io.FileOutputStream;
	import java.io.IOException;

	public class OutputStreamMain {

		public static void main(String[] args) {
			FileOutputStream fos = null;
			FileInputStream fis = null;
			
			try {
				//fos = new FileOutputStream("./0222byte.txt");//예외가 발생할 가능성이 있는 구문, 현재 프로젝트 디렉토리에 파일을 생성
				
				//byte [] ar = {97, 98, 99, 100, 101};
			//	String str = "안녕하세요";
			//	fos.write(str.getBytes());//문자열을 바이트 배열로 변환해서 기록 getBytes 이용- 중요
			//	fos.write(97);//파일 에 1바이트 기록
				
				/*byte [] b = new byte[4];
				fis.read(b);
				System.out.println(b);
				fis.flush();//버퍼의 내용을 비우기*/
				while(true){
				byte [] b = new byte[4];
				int r = fis.read(b);
				for(byte imsi : b) {
					System.out.println(imsi);
					if(r<=0) {break;}
				}
				}
				
				
			}catch(Exception e) {System.out.println("파일 입출력 예외: " + e.getMessage());}
			
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



