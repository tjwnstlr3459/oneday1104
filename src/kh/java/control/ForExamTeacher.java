package kh.java.control;

public class ForExamTeacher {

	//���η�  ������
	public void star4() {
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i+1);
		}
			System.out.println();
		}
	}
	//���η�  ������
	public void star5() {
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				System.out.print(j+1);
		}
			System.out.println();
		}
	}
	//���η� �þ�� ������
	public void star6() {
		for(int i=0; i<5; i++) {
			for(int j=0;j<5; j++) {
				System.out.print(j+1+i);
		}
			System.out.println();
		}
	}
	//���η� �پ��� ������
	public void star7() {
		for(int i=0; i<5; i++) {
			for(int j=0;j<5; j++) {
				System.out.print(j-i+5);
		}
			System.out.println();
		}
	}
	//������ Ŀ����
	public void star8() {
		for(int i=0; i<5; i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
		}
			System.out.println();
		}
	}
	//������ �۾�����
	public void star9() {
		for(int i=0; i<5; i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
		}
			System.out.println();
		}
	}
	//������ �̿��� ������ �۾�����
	public void star10() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<5-i; j++)
				System.out.print("*");
		}
			System.out.println();
	}
	//������ �̿��� ������ Ŀ����
	public void star11() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++)
			System.out.print("*");
			System.out.println();
		}
	}
	//if���� Ȱ���� Ŀ���� �۾�����
	public void star12() {
		for(int i=0; i<10; i++) {
			
			if(i<5) {
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
			}else {
				for(int j=0; j<10-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	//������ �̿��� ���𷡽ð��� ��
	public void star122() {
	for(int i=0; i<10; i++) {
		for(int j=0;(i<5)?j<i:j<10-i;j++) {
		System.out.print("*");
	}
	System.out.println();
		}
	}
	//������ �̿��� �𷡽ð��� ��
	public void star13() {
		for(int i=0; i<9; i++) {
			for(int j=0; (i<5)?j<5-i:j<i-3; j++) {
			System.out.print("*");
		}
		System.out.println();
			}
		}	
}