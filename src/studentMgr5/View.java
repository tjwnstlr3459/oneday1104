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
		System.out.println("====학생관리 프로그램v5====");
		System.out.println("1.학생 입력");
		System.out.println("2.전체 학생 출력");
		System.out.println("3.학생 출력(1명)");
		System.out.println("4.학생 수정");
		System.out.println("5.학생 삭제");
		System.out.println("0.프로그램 종료");
		System.out.print("선택>>>");
		// int sel = sc.nextInt();
		// return sel;
		return sc.nextInt();
		// 입력과 동시에 리턴
	}

	public Student getStudent(String str) {
		System.out.print(str + "할 학생 이름 : ");
		String name = sc.next();
		System.out.print(str + "할 학생 나이 : ");
		int age = sc.nextInt();
		System.out.print(str + "할 학생 주소 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		Student s = new Student(name, age, addr);
		return s;

	}

	public void getAllStudents(HashMap<String, Student> students) {
		System.out.println("====전체학생 출력====");
		System.out.println("이름\t나이\t주소");
		// 키셋을 통해 키값을 출력
		// 포리치를 안쓰면 어레이리스트로 출력
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
		System.out.print(str + "할 이름 입력 : ");
		String name = sc.next();
		return name;
	}

	public void printMsg(String str) {
		System.out.println(str);
	}

	public void printOneStudent(Student s) {
		System.out.println("====학생 1명 출력====");
		System.out.println("학생이름 : " + s.getName());
		System.out.println("학생나이 : " + s.getAge());
		System.out.println("학생주소 : " + s.getAddr());
	}
}
