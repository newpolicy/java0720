package members;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MemberMain {

	public static void main(String[] args) {
		//키보드로 부터 줄 단위로 입력을 받을 수 있는 클래스의 참조형 변수 섢언
		//finally 절에서 close 할 수 있도록 try밖에서 변수를 선언 합니다.
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("이름: ");
			String name = br.readLine(); // 문자열 한줄을 읽어 오기.
			System.out.print("나이: ");
			String age = br.readLine();
			System.out.print("키: ");
			String height = br.readLine();
			
			Members member = new Members();
			member.setName(name);
			member.setAge(Integer.parseInt(age)); //문자를 정수로 변환해서 저장
			member.setHeight(Double.parseDouble(height)); //문자를 실수로 변환해서 저장
			
			Map<String, Object> map = new HashMap<>();
			map.put("name", name);
			map.put("age", age);
			map.put("height", Double.parseDouble(height));
			System.out.println(member);
			System.out.println(map);
			//저장된 값을 사용해서 나이를 1씩 증가 시켜보까
			int r = member.getAge() + 1;
			int j = (Integer)map.get(age) + 1; //map에서는 데이터를 가져와서 사용할 때 강제 형 변환을 해주어야 한다.
				
		}catch(Exception e){
			System.out.println("예외 : " + e.getMessage());
		}finally {
			if(br != null)
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
