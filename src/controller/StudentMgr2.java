package controller;

import java.util.Scanner;

import controller.Student;

public class StudentMgr2 {

	Scanner sc;
	Student[] students;	//학생정보를 저장할 객체배열
	int index;			//배열을 관리하기 위한 변수
	
	public StudentMgr2() {
		sc = new Scanner(System.in);
		students = new Student[10];
		index = 0;
	}
	public void main() {
		while(true) {
			System.out.println("\n----학생관리 프로그램v2----\n");
			System.out.println("1.학생 정보 등록");
			System.out.println("2.학생 정보 출력(전체)");
			System.out.println("3.학생 정보 검색(1명 이름으로 검색)");
			System.out.println("4.학생 정보 수정");
			System.out.println("5.학생 정보 삭제");
			System.out.println("0.프로그램 종료");
			System.out.print("선택 > ");
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
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public void insertStudent() {
		System.out.println("\n----학생 정보 등록----\n");
		//Student s = new Student();
		
		//3.애초에 변수 생성하지 않고 바로 입력하는 방법
		System.out.print("학생 이름 입력 : ");
		//s.setName(sc.next());
		String name = sc.next();
		
		System.out.print("학생 나이 입력 : ");
		//s.setAge(sc.nextInt());
		int age = sc.nextInt();
		
		System.out.print("학생 주소 입력 : ");
		sc.nextLine();
		//.setAddr(sc.nextLine());
		String addr = sc.nextLine();
		
		/*
	 	//1.기본객체 생성 후 setter로 값 대입
		Student s = new Student();	//이름,주소 ->null, 나이는->0인 Student객체
		s.setName(name);			//s객체에 입력받은 이름값 저장
		s.setAge(age);				//s객체에 입력받은 나이값 저장
		s.setAddr(addr);			//s객체에 입력받은 주소값 저장
		students[index] = s;
		*/
		
		//2.매개변수 있는 생성자를 통해서 객체 생성하며 값을 대입
		Student s = new Student(name,age,addr);
		students[index] = s;
		index++;
		System.out.println("학생 정보 등록 완료");
		
	}
	
	public void printAllStudent() {
		System.out.println("\n----학생 정보 출력(전체)----\n");
		System.out.println("이름\t나이\t주소");
		System.out.println("--------------------------");
		for (int i = 0; i < index; i++) {
			System.out.println(students[i].getName()+"\t"+students[i].getAge()+"\t"+students[i].getAddr());
		}
	}
	public void printOneStudent() {
		System.out.println("\n----학생 정보 출력(1명)----\n");
		System.out.print("조회할 학생 이름 입력 : ");
		String name = sc.next();
		
		int searchIndex = searchStudent(name);
		
		if(searchIndex == -1) {
			System.out.println("학생 정보가 없습니다.");
		}else {
			System.out.println("이름 : "+students[searchIndex].getName());
			System.out.println("나이 : "+students[searchIndex].getAge());
			System.out.println("주소 : "+students[searchIndex].getAddr());
		}
	}
	
	public void modifyStudent() {
		System.out.println("\n----학생 정보 수정----\n");
		System.out.print("수정할 학생 이름 입력 : ");
		String name = sc.next();
		
		int searchIndex = searchStudent(name);
		if(searchIndex == -1 ) {
			System.out.println("학생 정보가 없습니다.");
		}else {
			System.out.print("수정할 이름 : ");
			students[searchIndex].setName(sc.next());
			
			System.out.print("수정할 나이 : ");
			students[searchIndex].setAge(sc.nextInt());
			
			System.out.print("수정할 주소 : ");
			sc.nextLine();
			students[searchIndex].setAddr(sc.nextLine());
			System.out.println("정보 수정 완료");
		}
	}
	
	public void deleteStudent() {
		System.out.println("\n----학생 정보 삭제----\n");
		System.out.print("삭제할 학생 이름 입력 : ");
		String name = sc.next();
		
		int searchIndex = searchStudent(name);
		
		if(searchIndex == -1) {
			System.out.println("학생 정보가 없습니다.");
		}else {
			for (int i = searchIndex; i <index-1; i++) {
				students[i] = students[i+1];
			}
			
			students[--index] = null;
//			index--;
//			students[searchIndex].setName(null);
//			students[searchIndex].setAge(0);
//			students[searchIndex].setAddr(null);
			System.out.println("삭제 완료");
		}
	}
	
	//학생정보를 통해 배열번호를 알아내는 코드
	public int searchStudent(String name) {
		for (int i = 0; i < index; i++) {
			if(students[i].getName().equals(name)) {
				return i;
			}
		}	
		return -1;
	}
}




























