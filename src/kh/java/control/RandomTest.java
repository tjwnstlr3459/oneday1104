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
		//컴터와 동전 맞추기
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		int win = 0;
		int lose = 0;
		
		boolean bool = true;
		
		while(bool) {
			//int win = 0;
			//int lose = 0;		//카운트 변수를 while문 안에 넣으면 매번 초기화되서 0이 된다
			
			System.out.println("==동전 앞/뒤 맞추기==");
			System.out.println("1.게임시작");
			System.out.println("2.Score");
			System.out.println("3.게임종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1:
				int coin = r.nextInt(2)+1;
				int select = 0;
	
				while(true) {
					System.out.print("선택하세요(1.앞면/ 2.뒷면) : ");
					select = sc.nextInt();
					if(select == 1 || select == 2) {
						break;
					}
					System.out.println("1또는 2를 입력하세요");
				}
				System.out.println("결과확인 : " + (coin==1?"앞면":"뒷면"));
				if(select == coin) {
					System.out.println("정답.");
					win++;
				}else {
					System.out.println("땡.");
					lose++;
				}
				break;
			case 2:
				System.out.println("<<전적>>");
				System.out.println("win : " + win);
				System.out.println("lose : " + lose);
				break;
			case 3:
				bool = false;
				break;	
		}	//switch 종료
			System.out.println();		
	}//while 종료
}
	
	
	
	
	
	public void game() {
		Scanner sc = new Scanner(System.in);
		
		Random ran = new Random();
		
		System.out.println("==가위 바위 보 게임==");
		
		int select = 0;
		
		int random = ran.nextInt(3)+1;
		
		while(true) {
		System.out.print("숫자를 선택하세요(1.가위 /2.바위 /3.보) : ");
		select = sc.nextInt();
		if(select == 1 || select ==2) {
			break;
			}
		System.out.println("1또는 2를 입력해주세요");
		}
		
		
		System.out.println("======결과======");
		if(select == 1) {
			System.out.println("당신은 가위를 냈습니다.");
		}else if(select == 2) {
			System.out.println("당신은 바위를 냈습니다.");
		}else if(select == 3) {
			System.out.println("당신은 보를 냈습니다.");
		}
		
		if(random == 1) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
		}else if(select == 2) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
		}else if(select == 3) {
			System.out.println("컴퓨터는 보를 냈습니다.");
		}
		
		System.out.println("==============");
		if(select == random) {
			System.out.println("무승부");
		}else if((select==1 && random==3)||(select==2 && random==1)||(select==3 && random==2)) {
			System.out.println("승리");
		}else {
			System.out.println("패배");
		}
	}
}		
		
		
		


















