package kh.java.test;

public class TV {
	//속성 : 크기, 전원, 볼륨, 채널			=>변수
	//크기->데이터타입: int, 		변수명 : size
	//전원->데이터타입: boolean,	변수명 : power
	//볼륨 ->데이터타입: int, 		변수명 : vol
	//채널->데이터타입: int, 		변수명 : ch
	
	//전역변수는 선언시 자동으로 초기화
	//숫자(정수*4,실수*2) > 0, 문자>(' '), 논리 > false, 참조형 > null
	int size;		//0
	public boolean power;	//false -> power true 전원켜짐, flase : 전원꺼짐
	public int vol;		//0
	int ch;			//0
	
	//기능 : 전원on/off, 볼륨조절, 채널변경	=>메소드
	//전원on/off -> 	메소드이름 : power
	//볼륨조절-> 		메소드이름 : volUp(), volDown()
	//채널변경->			메소드이름 : chUp(),chDown(),chChange()
	
	public void power() {
		power = !power;
		if(power) {
			System.out.println("전원이 켜졌습니다.");
		}else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	public void volUp() {
		vol++;
		System.out.println("현재 볼륨: " +vol);
	}
	public void volDown() {
		if(vol !=0) {
		vol--;
		System.out.println("현재 볼륨: " +vol);
		}
	}
	public void chUp() {
		ch++;
		System.out.println("현재 채널 : " + ch);
	}
	public void chDown() {
		ch--;
		System.out.println("현재 채널 : " + ch);
	}
	
	public void chChange(int changeCh) {
		ch = changeCh;
		System.out.println("현재 채널 : " + ch);
	}

}

















