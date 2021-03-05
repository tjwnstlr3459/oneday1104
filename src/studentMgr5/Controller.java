package studentMgr5;

import java.util.HashMap;

import studentMgr5.View;
import studentMgr5.Student;

public class Controller {

	// Ű���� �̸�����, ����� �л���ü�� ����
	HashMap<String, Student> students;
	View view;

	public Controller() {
		super();
		students = new HashMap<String, Student>();
		view = new View();
	}

	public void main() {
		while (true) {
			switch (view.showMenu()) {
			// ���� �������ϰ� �ٷ� switch���� ���ϸ޼ҵ� �ֱ�
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudents();
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
				System.out.println("bye~");
				return;

			}
		}
	}

	private void insertStudent() {
		Student s = view.getStudent("���");
		students.put(s.getName(), s);
	}

	private void printAllStudents() {
		view.getAllStudents(students);
	}

	public void printOneStudent() {
		String name = view.geName("��ȸ");
		// containkey(�Ű�����)->�Ű��������� �ִ��� ������ �˻�
		// ������ true/������ flase����

		// 1��° ���
		if (students.containsKey(name)) {
			Student s = students.get(name);
			view.printOneStudent(s);
		} else {
			view.printMsg("�������� �ʴ� �л��Դϴ�.");
		}

		// 2��°���
		Student s = students.get(name);
		if (s != null) {
			view.printOneStudent(s);
		} else {
			view.printMsg("�������� �ʴ� �л��Դϴ�.");
		}
	}

	private void modifyStudent() {
		String name = view.geName("����");
		if (students.containsKey(name)) {
			students.remove(name);
			// ���� ������ �ؾ��Ѵ�
			// ������ �Ʒ� ������ ������ �ѵ� Ű���� ���� �����Ѱ��� ������
			Student s = view.getStudent("����");
			students.put(s.getName(), s);
		} else {
			view.printMsg("�������� �ʴ� �л��Դϴ�.");
		}
	}

	private void deleteStudent() {
		String name = view.geName("����");
		if (students.containsKey(name)) {
			students.remove(name);
		} else {
			view.printMsg("�������� �ʴ� �л��Դϴ�.");
		}
	}
}
