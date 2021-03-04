package kr.or.iei.func;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class SetTest {

	public void setTest1() {
		HashSet<Integer> set = new HashSet<Integer>();
		boolean bool1 = set.add(10); // 데이터 입력 성공/실패 -> true/false
		System.out.println(bool1);
		boolean bool2 = set.add(20);
		System.out.println(bool2);
		System.out.println(set.size());

		boolean bool3 = set.add(10); // 중복값 안들어감
		System.out.println(bool3);

		System.out.println(set.add(30));
		System.out.println(set.add(40));
		System.out.println(set.size());
		System.out.println(set);

		// set은 인덱스로 값을 관리하지 않아서 하나씩 꺼내서 사용하는방법이 필요
		// 1. ArrayList를 이용하는 방법
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		for (Integer num : list) {
			System.out.println(num);
		}
		// 2.foreach사용
		for (Integer num : set) {
			System.out.println(num);
		}
		// 3.반복자(interator)
		Iterator<Integer> iter = set.iterator();

		while (iter.hasNext()) {
			Integer num = iter.next();
			System.out.println(num);
		}
	}

	public void check() {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		while (set.size() != 6) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			if (!set.add(num)) {
				System.out.println("중복 숫자!");
			}
		}
		System.out.println(set);
	}

	public void lootoo() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		//중복제거
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> com = new HashSet<Integer>();
		int count = 0;
		ArrayList<Integer> aSet = new ArrayList<Integer>(set);
		ArrayList<Integer> aCom = new ArrayList<Integer>(com);

		System.out.println("====로또 프로그램====");

		for (int i = 0; i < 6; i++) {
			System.out.print((i + 1) + "번째 번호 입력 : ");
			int num = sc.nextInt();

			if (!set.add(num)) {
				System.out.println("중복된 번호입니다.");
				i--;
			} else if (num > 0 && num < 46) {
				aSet.add(num);
			} else {
				System.out.println("잘못 입력하셨습니다 1~45중 한개를 입력해주세요");
				i--;
			}
		}
	
		System.out.println("사용자 번호");
		Collections.sort(aSet);
		System.out.println(aSet);
		//hashSet으로 하기엔 배열인덱스값이 없어 정렬을 할수가 없음
		//arrayList 변수로 옮긴다음 변수로 배열인덱스 정렬해서 출력 
		//hashSet은 자동으로 중복값 제거(flase)
		
		System.out.println("컴퓨터 번호");
		for (int i = 0; i < 6; i++) {
			aCom.add(r.nextInt(45) + 1);
		}
		Collections.sort(aCom);
		System.out.println(aCom);

		// 맞춘개수
		//마찬가지로 hashSet으론 인덱스으로 비교가 불가능해 ArrayList변수로 비교
		for (int i = 0; i < aSet.size(); i++) {
			for (int j = 0; j < aCom.size(); j++) {
				if (aSet.get(i) == aCom.get(j)) {
					count++;
				}
			}
		}

		System.out.println("맞은개수 : " + count);

		switch (count) {
		case 6:
			System.out.println("1등입니다");
			break;
		case 5:
			System.out.println("2등입니다");
			break;
		case 4:
			System.out.println("3등입니다");
			break;
		default:
			System.out.println("꽝입니다");

		}
	}
}
