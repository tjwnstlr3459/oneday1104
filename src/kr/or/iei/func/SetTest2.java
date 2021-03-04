package kr.or.iei.func;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class SetTest2 {

	private int count;

	public void lootoo() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		//set을 쓰는 큰 이유는 중복값 제거
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> com = new HashSet<Integer>();
		
		while(set.size() !=6) {
			System.out.print("숫자입렵[1-45] : ");
			int num = sc.nextInt();
			if(num>0 && num<46) {
				boolean bool = set.add(num);
				if(!bool) {
			  //if(!set.add(num){	//이것도 가능
					System.out.println("중복숫자입니다.");
				}
			}else {
				System.out.println("1-45 사이 숫자를 입력하세요");
			}
		}
		while(com.size() !=6) {
			int randNum = r.nextInt(45)+1;
			com.add(randNum);
			//com.add(r.nextInt(45)+1);
		}
		
		ArrayList<Integer> aSet = new ArrayList<Integer>(set);
		ArrayList<Integer> aCom = new ArrayList<Integer>(com);
		Collections.sort(aSet);
		Collections.sort(aCom);
		System.out.println("사용자 번호");
		for (int num : aSet) {
			System.out.println(num+" ");
		}
		System.out.println();
		System.out.println("컴퓨터번호");
		for (int num : aCom) {
			System.out.print(num+" ");
		}
		
		for (int i = 0; i < aSet.size(); i++) {
			for (int j = 0; j < aCom.size(); j++) {
				if(aSet.get(i) == aCom.get(j)) {
					count++;
					break; //중복값이 없기에 그냥 break한다
				}
			}
		}
		System.out.println("\n맞은개수 : " + count);

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























