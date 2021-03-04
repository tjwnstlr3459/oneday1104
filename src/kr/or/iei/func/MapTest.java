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
		list.add("안녕");
		
		map.put(0, "Hello");
		map.put(1, "Hi");
		map.put(2, "bye");
		map.put(100, "안녕하세요");
		//리스트에서 Hi출력
		System.out.println(list.get(1));
		System.out.println(map.get(1));
		
		//String str1	= list.get(5);//오류
		String str2 = map.get(5);//해당 키값이 존재하면 키에 해당하는 value값 출력
								 //키값이 존재하지 않으면 null 출력
		System.out.println(str2);
		
		map.remove(1);	//삭제
		String str = map.get(1);
		System.out.println(str);
	}
	
	public void mapTest2() {
		HashMap<String , String> map = new HashMap<String, String>();
		map.put("one", "하나");
		map.put("two", "둘");
		map.put("three", "셋");
		System.out.println(map.get("two"));
		System.out.println(map.get("four"));
		
		map.put("two", "넷");	//덮어씌우기
		System.out.println(map.get("two"));
		
		boolean bool = map.containsKey("two");
		System.out.println(bool);
		
		//전체출력하기
		//hashset을 이용한 방법 1.어레이 2.포어치 3.화일
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(map.get(key));
		}
		
	}
}
























