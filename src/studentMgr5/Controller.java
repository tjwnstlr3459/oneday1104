package studentMgr5;

import java.util.HashMap;

import studentMgr5.View;
import studentMgr5.Student;

public class Controller {

	// 키값은 이름으로, 밸류는 학생객체로 관리
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
			// 변수 지정안하고 바로 switch문에 리턴메소드 넣기
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
		Student s = view.getStudent("등록");
		students.put(s.getName(), s);
	}

	private void printAllStudents() {
		view.getAllStudents(students);
	}

	public void printOneStudent() {
		String name = view.geName("조회");
		// containkey(매개변수)->매개변수값이 있는지 없는지 검사
		// 있으면 true/없으면 flase리턴

		// 1번째 방식
		if (students.containsKey(name)) {
			Student s = students.get(name);
			view.printOneStudent(s);
		} else {
			view.printMsg("존재하지 않는 학생입니다.");
		}

		// 2번째방식
		Student s = students.get(name);
		if (s != null) {
			view.printOneStudent(s);
		} else {
			view.printMsg("존재하지 않는 학생입니다.");
		}
	}

	private void modifyStudent() {
		String name = view.geName("수정");
		if (students.containsKey(name)) {
			students.remove(name);
			// 먼저 삭제를 해야한다
			// 삭제가 아래 있으면 수정을 한뒤 키값이 겹쳐 수정한값을 삭제함
			Student s = view.getStudent("수정");
			students.put(s.getName(), s);
		} else {
			view.printMsg("존재하지 않는 학생입니다.");
		}
	}

	private void deleteStudent() {
		String name = view.geName("수정");
		if (students.containsKey(name)) {
			students.remove(name);
		} else {
			view.printMsg("존재하지 않는 학생입니다.");
		}
	}
}
