package members;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MemberMain {

	public static void main(String[] args) {
		//Ű����� ���� �� ������ �Է��� ���� �� �ִ� Ŭ������ ������ ���� ����
		//finally ������ close �� �� �ֵ��� try�ۿ��� ������ ���� �մϴ�.
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("�̸�: ");
			String name = br.readLine(); // ���ڿ� ������ �о� ����.
			System.out.print("����: ");
			String age = br.readLine();
			System.out.print("Ű: ");
			String height = br.readLine();
			
			Members member = new Members();
			member.setName(name);
			member.setAge(Integer.parseInt(age)); //���ڸ� ������ ��ȯ�ؼ� ����
			member.setHeight(Double.parseDouble(height)); //���ڸ� �Ǽ��� ��ȯ�ؼ� ����
			
			Map<String, Object> map = new HashMap<>();
			map.put("name", name);
			map.put("age", age);
			map.put("height", Double.parseDouble(height));
			System.out.println(member);
			System.out.println(map);
			//����� ���� ����ؼ� ���̸� 1�� ���� ���Ѻ���
			int r = member.getAge() + 1;
			int j = (Integer)map.get(age) + 1; //map������ �����͸� �����ͼ� ����� �� ���� �� ��ȯ�� ���־�� �Ѵ�.
				
		}catch(Exception e){
			System.out.println("���� : " + e.getMessage());
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
