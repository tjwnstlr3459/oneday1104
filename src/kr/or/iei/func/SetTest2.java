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
		//set�� ���� ū ������ �ߺ��� ����
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> com = new HashSet<Integer>();
		
		while(set.size() !=6) {
			System.out.print("�����Է�[1-45] : ");
			int num = sc.nextInt();
			if(num>0 && num<46) {
				boolean bool = set.add(num);
				if(!bool) {
			  //if(!set.add(num){	//�̰͵� ����
					System.out.println("�ߺ������Դϴ�.");
				}
			}else {
				System.out.println("1-45 ���� ���ڸ� �Է��ϼ���");
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
		System.out.println("����� ��ȣ");
		for (int num : aSet) {
			System.out.println(num+" ");
		}
		System.out.println();
		System.out.println("��ǻ�͹�ȣ");
		for (int num : aCom) {
			System.out.print(num+" ");
		}
		
		for (int i = 0; i < aSet.size(); i++) {
			for (int j = 0; j < aCom.size(); j++) {
				if(aSet.get(i) == aCom.get(j)) {
					count++;
					break; //�ߺ����� ���⿡ �׳� break�Ѵ�
				}
			}
		}
		System.out.println("\n�������� : " + count);

		switch (count) {
		case 6:
			System.out.println("1���Դϴ�");
			break;
		case 5:
			System.out.println("2���Դϴ�");
			break;
		case 4:
			System.out.println("3���Դϴ�");
			break;
		default:
			System.out.println("���Դϴ�");

		}
	}
}























