package kh.java.test;

public class TV {
	//�Ӽ� : ũ��, ����, ����, ä��			=>����
	//ũ��->������Ÿ��: int, 		������ : size
	//����->������Ÿ��: boolean,	������ : power
	//���� ->������Ÿ��: int, 		������ : vol
	//ä��->������Ÿ��: int, 		������ : ch
	
	//���������� ����� �ڵ����� �ʱ�ȭ
	//����(����*4,�Ǽ�*2) > 0, ����>(' '), �� > false, ������ > null
	int size;		//0
	public boolean power;	//false -> power true ��������, flase : ��������
	public int vol;		//0
	int ch;			//0
	
	//��� : ����on/off, ��������, ä�κ���	=>�޼ҵ�
	//����on/off -> 	�޼ҵ��̸� : power
	//��������-> 		�޼ҵ��̸� : volUp(), volDown()
	//ä�κ���->			�޼ҵ��̸� : chUp(),chDown(),chChange()
	
	public void power() {
		power = !power;
		if(power) {
			System.out.println("������ �������ϴ�.");
		}else {
			System.out.println("������ �������ϴ�.");
		}
	}
	public void volUp() {
		vol++;
		System.out.println("���� ����: " +vol);
	}
	public void volDown() {
		if(vol !=0) {
		vol--;
		System.out.println("���� ����: " +vol);
		}
	}
	public void chUp() {
		ch++;
		System.out.println("���� ä�� : " + ch);
	}
	public void chDown() {
		ch--;
		System.out.println("���� ä�� : " + ch);
	}
	
	public void chChange(int changeCh) {
		ch = changeCh;
		System.out.println("���� ä�� : " + ch);
	}

}

















