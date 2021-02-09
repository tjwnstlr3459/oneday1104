package kh.java.control;

public class ForExam3 {

	public void star1() {
		
		for(int i=0; i<10; i++) {
			if(i<10/2) {
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int j=0; j<10-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
			
	}
	
	public void star2() {
		for(int i = 1; i <= 7; i++) { // 총 10줄을 출력하기 위한 반복문입니다.
	        if(i <= 7/2 + 1) {
	           for(int j = 0; j < i; j++) // 한줄에 별을 i 개 만큼 찍기 위해 j를 이용해 반복하는 반복문입니다.
	               System.out.print("*"); // 별 찍기
	        } 
	        else {
	        for(int j = 0; j < 7-i+1; j++) // 한줄에 별을 찍는데 감소되는..
	               System.out.print("*"); // 별 찍기
	        }
	            System.out.println(""); // 한줄 만큼의 별을 찍고난후 enter! 
	    }
	}
	
	public void star3() {
		for(int i=0; i<10; i++) {
			if(i<6) {
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int j=0; j<10-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}