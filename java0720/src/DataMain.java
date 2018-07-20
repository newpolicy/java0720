import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("./access_log.txt"));
			StringBuilder sb = new StringBuilder();
			ArrayList<String> iplist = new ArrayList<>();
			Set<String> ipset = new HashSet<>();
			while(true) {
				String line = br.readLine(); //���� �б�
				if(line == null) {  //���� �����Ͱ� ������ ����
					break;
				}
				String [] ar = line.split(" ");
				//System.out.println(ar[0]);
			//	iplist.add(ar[0]);
				ipset.add(ar[0]);
				for(String ip : ipset) {
					System.out.println(ip);
				}
				
			}
			System.out.println(iplist.size());
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


