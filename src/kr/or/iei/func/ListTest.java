package kr.or.iei.func;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest {

	public void listTest1() {
		String[] str = new String[3];
		str[0] = "hi";
		str[1] = "hello";
		str[2] = "�ȳ�";
		//str[3] = "�߰��Է�";	//�迭�ʱⰪ�� ����� ����
		
		System.out.println("�迭 ���� ���");
		for (int i = 0; i < str.length; i++) {
			System.out.println((i+1)+". "+str[i]);
		}
		
		ArrayList<String > list = new ArrayList<String>();
		//���׸� ����̱⿡ <> �ȿ� ���������� �����(wrapp)
		System.out.println("listsize : " + list.size());
		list.add("hi");		//list�� ���� �ڿ� hi�� �߰�
		System.out.println("listsize : " + list.size());
		list.add("hello");
		System.out.println("listsize : " + list.size());
		list.add("�ȳ�");
		System.out.println("listsize : " + list.size());
		System.out.println();
		
		System.out.println("����Ʈ ���� ���");
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
		//����
		list.remove(2);	//������� (�ڵ����� �迭������ �پ��)
		System.out.println("listsize : " + list.size());
		
		System.out.println("����Ʈ ���� ���");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+". "+list.get(i));		
		}		
		//����
		int num = list.set(3, 100);
		//int num<<���⿡ ������ 100�� �ƴ� �������� ���� num�� �����Ѵ�
		
		System.out.println("num : " + num);
		System.out.println("����Ʈ ���� ���");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+". "+list.get(i));		
		}
		
		//����(��������)
		Collections.sort(list);
		System.out.println("����Ʈ ���� ���");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+". "+list.get(i));		
		}
		//��������
		Collections.reverse(list);
		System.out.println(list);
		//����Ʈ ��ü����
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
		
		//foreach�� -> collection, list�� for��
		for (Integer num : list) {
			System.out.println(num);
		}
		
	}
}

























