package kh.java.control;
import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public void random1() {
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int randomNumber = r.nextInt(10); //0~9
		System.out.println(randomNumber);
		
		int randNumber1 = r.nextInt(2);		//0 1
		System.out.println(randNumber1);
		
		int randNumber2 = r.nextInt(16);		//0~15
		System.out.println(randNumber2);
		
		int randNumber3 = r.nextInt(10)+1;		//1~10
		System.out.println(randNumber3);
		
		int randNumber4 = r.nextInt(16)+20;		//20~35
		System.out.println(randNumber4);
		
		sc.nextInt();
		r.nextInt();
	}
	
	
	public void coin() {
		//���Ϳ� ���� ���߱�
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		int win = 0;
		int lose = 0;
		
		boolean bool = true;
		
		while(bool) {
			//int win = 0;
			//int lose = 0;		//ī��Ʈ ������ while�� �ȿ� ������ �Ź� �ʱ�ȭ�Ǽ� 0�� �ȴ�
			
			System.out.println("==���� ��/�� ���߱�==");
			System.out.println("1.���ӽ���");
			System.out.println("2.Score");
			System.out.println("3.��������");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1:
				int coin = r.nextInt(2)+1;
				int select = 0;
	
				while(true) {
					System.out.print("�����ϼ���(1.�ո�/ 2.�޸�) : ");
					select = sc.nextInt();
					if(select == 1 || select == 2) {
						break;
					}
					System.out.println("1�Ǵ� 2�� �Է��ϼ���");
				}
				System.out.println("���Ȯ�� : " + (coin==1?"�ո�":"�޸�"));
				if(select == coin) {
					System.out.println("����.");
					win++;
				}else {
					System.out.println("��.");
					lose++;
				}
				break;
			case 2:
				System.out.println("<<����>>");
				System.out.println("win : " + win);
				System.out.println("lose : " + lose);
				break;
			case 3:
				bool = false;
				break;	
		}	//switch ����
			System.out.println();		
	}//while ����
}
	
	
	
	
	
	public void game() {
		Scanner sc = new Scanner(System.in);
		
		Random ran = new Random();
		
		System.out.println("==���� ���� �� ����==");
		
		int select = 0;
		
		int random = ran.nextInt(3)+1;
		
		while(true) {
		System.out.print("���ڸ� �����ϼ���(1.���� /2.���� /3.��) : ");
		select = sc.nextInt();
		if(select == 1 || select ==2) {
			break;
			}
		System.out.println("1�Ǵ� 2�� �Է����ּ���");
		}
		
		
		System.out.println("======���======");
		if(select == 1) {
			System.out.println("����� ������ �½��ϴ�.");
		}else if(select == 2) {
			System.out.println("����� ������ �½��ϴ�.");
		}else if(select == 3) {
			System.out.println("����� ���� �½��ϴ�.");
		}
		
		if(random == 1) {
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
		}else if(select == 2) {
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
		}else if(select == 3) {
			System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
		}
		
		System.out.println("==============");
		if(select == random) {
			System.out.println("���º�");
		}else if((select==1 && random==3)||(select==2 && random==1)||(select==3 && random==2)) {
			System.out.println("�¸�");
		}else {
			System.out.println("�й�");
		}
	}
}		
		
		
		


















