package kh.java.test;

public class StudentMgr {
	public void main() {
		Student s1 = new Student();	
		//new + ������ȣ�� �� 
		//->�޸𸮿� �ش��ϴ� ��ü�����ϰ� �ش� �ּҰ��� ��ȯ
		// s1 ���� ���� �Է� �й�, �̸�, �иŰ�, ����, ���� ->setter�� ���ؼ� �� �Է�
		//getter�� ���ؼ� ���
		Student s2 = new Student();
		//���� �����ϰ� ����� �����ϴ�(������ �ν��Ͻ� ��� �Ѵ�)
		Student s3 = new Student(2222,"���ؽ�","������",30,'��');
		
		s1.setStdNo(2018);
		s1.setName("���ؽ�");
		s1.setDept("�����а�");
		s1.setAge(22);
		s1.setGender('m');
		
		int stdNo = s1.getStdNo();
		System.out.println(stdNo);
		System.out.println(s1.getName());
		System.out.println(s1.getDept());
		System.out.println(s1.getAge());
		System.out.println(s1.getGender());
		
		s2.setStdNo(11111);
		System.out.println(s2.getAge());	//�⺻�����ڿ��� age=20 �� ����
		
	}

}
