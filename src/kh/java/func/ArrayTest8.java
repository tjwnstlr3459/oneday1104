package kh.java.func;

import java.util.Scanner;

public class ArrayTest8 {

	public void test1() {
		
	Scanner sc = new Scanner(System.in);
	
	
	//논리형을 쓴 방식
	boolean[]rooms = new boolean[10];	//기본 배열내 값은 0이 저장되어있음
	
	
	boolean bool = true;	//while문
	
	while(bool) {
	System.out.println("모텔 관리 프로그램 v1.0");
	System.out.println("1.입실\t2.퇴실\t3.방보기\t4.종료");
	int num = sc.nextInt();
	
	switch (num) {
	case 1://입실
		System.out.print("몇번방에 입실하시겠습니까?");
		int room = sc.nextInt();
	
		//방선택
		if(!rooms[room-1]) {	//느낌표를 붙여주면 부정형이 된다
			rooms[room-1]=true;	
			System.out.println(room+"번방에 입실하셨습니다.");
		}else {
			System.out.println(room+"번방에 현재 손님이 있습니다.");
		}
		break;
		
	case 2://퇴실
		System.out.println("몇번 방에서 퇴실하시겠습니까?");
		int outNo = sc.nextInt();
		if(rooms[outNo-1]) {	//!가 없으면 true
			rooms[outNo-1]=false;
			System.out.println(outNo+"번 방에서 퇴실하셨습니다.");
		}
		break;
		
	case 3://방보기
		for (int i = 0; i < rooms.length; i++) {
			if(!rooms[i]) {
				System.out.println((i+1)+"번방이 현재 비어있습니다.");
			}else {
				System.out.println((i+1)+"번방은 현재 이용중입니다.");
			}
		}
		break;
	case 4://종료
		bool = false;
		break;
			}
		}
	}
}














