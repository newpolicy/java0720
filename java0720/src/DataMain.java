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
				String line = br.readLine(); //한줄 읽기
				if(line == null) {  //읽은 데이터가 없으면 종료
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


