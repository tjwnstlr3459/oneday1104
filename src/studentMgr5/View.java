package studentMgr5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import studentMgr5.Student;

public class View {
	Scanner sc;

	public View() {
		super();
		sc = new Scanner(System.in);
	}

	public int showMenu() {
		System.out.println("====�л����� ���α׷�v5====");
		System.out.println("1.�л� �Է�");
		System.out.println("2.��ü �л� ���");
		System.out.println("3.�л� ���(1��)");
		System.out.println("4.�л� ����");
		System.out.println("5.�л� ����");
		System.out.println("0.���α׷� ����");
		System.out.print("����>>>");
		// int sel = sc.nextInt();
		// return sel;
		return sc.nextInt();
		// �Է°� ���ÿ� ����
	}

	public Student getStudent(String str) {
		System.out.print(str + "�� �л� �̸� : ");
		String name = sc.next();
		System.out.print(str + "�� �л� ���� : ");
		int age = sc.nextInt();
		System.out.print(str + "�� �л� �ּ� : ");
		sc.nextLine();
		String addr = sc.nextLine();
		Student s = new Student(name, age, addr);
		return s;

	}

	public void getAllStudents(HashMap<String, Student> students) {
		System.out.println("====��ü�л� ���====");
		System.out.println("�̸�\t����\t�ּ�");
		// Ű���� ���� Ű���� ���
		// ����ġ�� �Ⱦ��� ��̸���Ʈ�� ���
		Set<String> keys = students.keySet();

		for (String key : keys) {
			System.out.println(students.get(key));
		}
		/*
		 * ArrayList<String>key = new ArrayList<String>(keys); for (int i = 0; i <
		 * key.size(); i++) { String currKey = key.get(i);
		 * System.out.println(students.get(currKey)); }
		 */

	}

	public String geName(String str) {
		System.out.print(str + "�� �̸� �Է� : ");
		String name = sc.next();
		return name;
	}

	public void printMsg(String str) {
		System.out.println(str);
	}

	public void printOneStudent(Student s) {
		System.out.println("====�л� 1�� ���====");
		System.out.println("�л��̸� : " + s.getName());
		System.out.println("�л����� : " + s.getAge());
		System.out.println("�л��ּ� : " + s.getAddr());
	}
}
