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
		boolean bool1 = set.add(10); // ������ �Է� ����/���� -> true/false
		System.out.println(bool1);
		boolean bool2 = set.add(20);
		System.out.println(bool2);
		System.out.println(set.size());

		boolean bool3 = set.add(10); // �ߺ��� �ȵ�
		System.out.println(bool3);

		System.out.println(set.add(30));
		System.out.println(set.add(40));
		System.out.println(set.size());
		System.out.println(set);

		// set�� �ε����� ���� �������� �ʾƼ� �ϳ��� ������ ����ϴ¹���� �ʿ�
		// 1. ArrayList�� �̿��ϴ� ���
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		for (Integer num : list) {
			System.out.println(num);
		}
		// 2.foreach���
		for (Integer num : set) {
			System.out.println(num);
		}
		// 3.�ݺ���(interator)
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
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			if (!set.add(num)) {
				System.out.println("�ߺ� ����!");
			}
		}
		System.out.println(set);
	}

	public void lootoo() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		//�ߺ�����
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> com = new HashSet<Integer>();
		int count = 0;
		ArrayList<Integer> aSet = new ArrayList<Integer>(set);
		ArrayList<Integer> aCom = new ArrayList<Integer>(com);

		System.out.println("====�ζ� ���α׷�====");

		for (int i = 0; i < 6; i++) {
			System.out.print((i + 1) + "��° ��ȣ �Է� : ");
			int num = sc.nextInt();

			if (!set.add(num)) {
				System.out.println("�ߺ��� ��ȣ�Դϴ�.");
				i--;
			} else if (num > 0 && num < 46) {
				aSet.add(num);
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ� 1~45�� �Ѱ��� �Է����ּ���");
				i--;
			}
		}
	
		System.out.println("����� ��ȣ");
		Collections.sort(aSet);
		System.out.println(aSet);
		//hashSet���� �ϱ⿣ �迭�ε������� ���� ������ �Ҽ��� ����
		//arrayList ������ �ű���� ������ �迭�ε��� �����ؼ� ��� 
		//hashSet�� �ڵ����� �ߺ��� ����(flase)
		
		System.out.println("��ǻ�� ��ȣ");
		for (int i = 0; i < 6; i++) {
			aCom.add(r.nextInt(45) + 1);
		}
		Collections.sort(aCom);
		System.out.println(aCom);

		// ���ᰳ��
		//���������� hashSet���� �ε������� �񱳰� �Ұ����� ArrayList������ ��
		for (int i = 0; i < aSet.size(); i++) {
			for (int j = 0; j < aCom.size(); j++) {
				if (aSet.get(i) == aCom.get(j)) {
					count++;
				}
			}
		}

		System.out.println("�������� : " + count);

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
