package kh.java.test;

public class StudentMgr {
	public void main() {
		Student s1 = new Student();	
		//new + 생성자호출 시 
		//->메모리에 해당하는 객체생성하고 해당 주소값을 반환
		// s1 본인 정보 입력 학번, 이름, 학매과, 나이, 성별 ->setter를 통해서 값 입력
		//getter를 통해서 출력
		Student s2 = new Student();
		//따로 저장하고 출력이 가능하다(각각의 인스턴스 라고 한다)
		Student s3 = new Student(2222,"서준식","정보과",30,'남');
		
		s1.setStdNo(2018);
		s1.setName("서준식");
		s1.setDept("정보학과");
		s1.setAge(22);
		s1.setGender('m');
		
		int stdNo = s1.getStdNo();
		System.out.println(stdNo);
		System.out.println(s1.getName());
		System.out.println(s1.getDept());
		System.out.println(s1.getAge());
		System.out.println(s1.getGender());
		
		s2.setStdNo(11111);
		System.out.println(s2.getAge());	//기본생성자에서 age=20 을 설정
		
	}

}
