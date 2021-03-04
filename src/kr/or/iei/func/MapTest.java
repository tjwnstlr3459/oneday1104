package kr.or.iei.func;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public void mapTest1() {
		ArrayList<String> list = new ArrayList<String>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		list.add("Hello");
		list.add("hi");
		list.add("bye");
		list.add("�ȳ�");
		
		map.put(0, "Hello");
		map.put(1, "Hi");
		map.put(2, "bye");
		map.put(100, "�ȳ��ϼ���");
		//����Ʈ���� Hi���
		System.out.println(list.get(1));
		System.out.println(map.get(1));
		
		//String str1	= list.get(5);//����
		String str2 = map.get(5);//�ش� Ű���� �����ϸ� Ű�� �ش��ϴ� value�� ���
								 //Ű���� �������� ������ null ���
		System.out.println(str2);
		
		map.remove(1);	//����
		String str = map.get(1);
		System.out.println(str);
	}
	
	public void mapTest2() {
		HashMap<String , String> map = new HashMap<String, String>();
		map.put("one", "�ϳ�");
		map.put("two", "��");
		map.put("three", "��");
		System.out.println(map.get("two"));
		System.out.println(map.get("four"));
		
		map.put("two", "��");	//������
		System.out.println(map.get("two"));
		
		boolean bool = map.containsKey("two");
		System.out.println(bool);
		
		//��ü����ϱ�
		//hashset�� �̿��� ��� 1.��� 2.����ġ 3.ȭ��
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(map.get(key));
		}
		
	}
}
























