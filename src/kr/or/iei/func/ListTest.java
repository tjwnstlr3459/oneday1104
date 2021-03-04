package kr.or.iei.func;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest {

	public void listTest1() {
		String[] str = new String[3];
		str[0] = "hi";
		str[1] = "hello";
		str[2] = "안녕";
		//str[3] = "추가입력";	//배열초기값을 벗어나서 오류
		
		System.out.println("배열 내용 출력");
		for (int i = 0; i < str.length; i++) {
			System.out.println((i+1)+". "+str[i]);
		}
		
		ArrayList<String > list = new ArrayList<String>();
		//제네릭 방식이기에 <> 안에 참조형으로 써야함(wrapp)
		System.out.println("listsize : " + list.size());
		list.add("hi");		//list의 가장 뒤에 hi를 추가
		System.out.println("listsize : " + list.size());
		list.add("hello");
		System.out.println("listsize : " + list.size());
		list.add("안녕");
		System.out.println("listsize : " + list.size());
		System.out.println();
		
		System.out.println("리스트 내용 출력");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+". "+list.get(i));
		}
	}
	public void listTest2() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(100);
		list.add(55);
		list.add(80);
		
		System.out.println("listsize : " + list.size());
		//삭제
		list.remove(2);	//삭제기능 (자동으로 배열범위도 줄어듬)
		System.out.println("listsize : " + list.size());
		
		System.out.println("리스트 내용 출력");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+". "+list.get(i));		
		}		
		//수정
		int num = list.set(3, 100);
		//int num<<여기에 넣을시 100이 아닌 변경전의 값을 num에 저장한다
		
		System.out.println("num : " + num);
		System.out.println("리스트 내용 출력");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+". "+list.get(i));		
		}
		
		//정렬(오름차순)
		Collections.sort(list);
		System.out.println("리스트 내용 출력");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+". "+list.get(i));		
		}
		//내림차순
		Collections.reverse(list);
		System.out.println(list);
		//리스트 전체삭제
		list.clear();
		System.out.println(list);
	}
	
	public void listTest3() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(21);
		list.add(100);
		list.add(1);
		list.add(18293);
	/*	
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		//foreach문 -> collection, list용 for문
		for (Integer num : list) {
			System.out.println(num);
		}
		
	}
}

























