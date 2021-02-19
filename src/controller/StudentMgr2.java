package controller;

import java.util.Scanner;

import controller.Student;

public class StudentMgr2 {

	Scanner sc;
	Student[] students;	//�л������� ������ ��ü�迭
	int index;			//�迭�� �����ϱ� ���� ����
	
	public StudentMgr2() {
		sc = new Scanner(System.in);
		students = new Student[10];
		index = 0;
	}
	public void main() {
		while(true) {
			System.out.println("\n----�л����� ���α׷�v2----\n");
			System.out.println("1.�л� ���� ���");
			System.out.println("2.�л� ���� ���(��ü)");
			System.out.println("3.�л� ���� �˻�(1�� �̸����� �˻�)");
			System.out.println("4.�л� ���� ����");
			System.out.println("5.�л� ���� ����");
			System.out.println("0.���α׷� ����");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			
			switch (sel) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				printOneStudent();
				break;
			case 4:
				modifyStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				System.out.println("bye~!");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	public void insertStudent() {
		System.out.println("\n----�л� ���� ���----\n");
		//Student s = new Student();
		
		//3.���ʿ� ���� �������� �ʰ� �ٷ� �Է��ϴ� ���
		System.out.print("�л� �̸� �Է� : ");
		//s.setName(sc.next());
		String name = sc.next();
		
		System.out.print("�л� ���� �Է� : ");
		//s.setAge(sc.nextInt());
		int age = sc.nextInt();
		
		System.out.print("�л� �ּ� �Է� : ");
		sc.nextLine();
		//.setAddr(sc.nextLine());
		String addr = sc.nextLine();
		
		/*
	 	//1.�⺻��ü ���� �� setter�� �� ����
		Student s = new Student();	//�̸�,�ּ� ->null, ���̴�->0�� Student��ü
		s.setName(name);			//s��ü�� �Է¹��� �̸��� ����
		s.setAge(age);				//s��ü�� �Է¹��� ���̰� ����
		s.setAddr(addr);			//s��ü�� �Է¹��� �ּҰ� ����
		students[index] = s;
		*/
		
		//2.�Ű����� �ִ� �����ڸ� ���ؼ� ��ü �����ϸ� ���� ����
		Student s = new Student(name,age,addr);
		students[index] = s;
		index++;
		System.out.println("�л� ���� ��� �Ϸ�");
		
	}
	
	public void printAllStudent() {
		System.out.println("\n----�л� ���� ���(��ü)----\n");
		System.out.println("�̸�\t����\t�ּ�");
		System.out.println("--------------------------");
		for (int i = 0; i < index; i++) {
			System.out.println(students[i].getName()+"\t"+students[i].getAge()+"\t"+students[i].getAddr());
		}
	}
	public void printOneStudent() {
		System.out.println("\n----�л� ���� ���(1��)----\n");
		System.out.print("��ȸ�� �л� �̸� �Է� : ");
		String name = sc.next();
		
		int searchIndex = searchStudent(name);
		
		if(searchIndex == -1) {
			System.out.println("�л� ������ �����ϴ�.");
		}else {
			System.out.println("�̸� : "+students[searchIndex].getName());
			System.out.println("���� : "+students[searchIndex].getAge());
			System.out.println("�ּ� : "+students[searchIndex].getAddr());
		}
	}
	
	public void modifyStudent() {
		System.out.println("\n----�л� ���� ����----\n");
		System.out.print("������ �л� �̸� �Է� : ");
		String name = sc.next();
		
		int searchIndex = searchStudent(name);
		if(searchIndex == -1 ) {
			System.out.println("�л� ������ �����ϴ�.");
		}else {
			System.out.print("������ �̸� : ");
			students[searchIndex].setName(sc.next());
			
			System.out.print("������ ���� : ");
			students[searchIndex].setAge(sc.nextInt());
			
			System.out.print("������ �ּ� : ");
			sc.nextLine();
			students[searchIndex].setAddr(sc.nextLine());
			System.out.println("���� ���� �Ϸ�");
		}
	}
	
	public void deleteStudent() {
		System.out.println("\n----�л� ���� ����----\n");
		System.out.print("������ �л� �̸� �Է� : ");
		String name = sc.next();
		
		int searchIndex = searchStudent(name);
		
		if(searchIndex == -1) {
			System.out.println("�л� ������ �����ϴ�.");
		}else {
			for (int i = searchIndex; i <index-1; i++) {
				students[i] = students[i+1];
			}
			
			students[--index] = null;
//			index--;
//			students[searchIndex].setName(null);
//			students[searchIndex].setAge(0);
//			students[searchIndex].setAddr(null);
			System.out.println("���� �Ϸ�");
		}
	}
	
	//�л������� ���� �迭��ȣ�� �˾Ƴ��� �ڵ�
	public int searchStudent(String name) {
		for (int i = 0; i < index; i++) {
			if(students[i].getName().equals(name)) {
				return i;
			}
		}	
		return -1;
	}
}




























