package kh.java.control;

public class ForExamTeacher {

	//가로로  숫자형
	public void star4() {
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i+1);
		}
			System.out.println();
		}
	}
	//세로로  숫자형
	public void star5() {
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				System.out.print(j+1);
		}
			System.out.println();
		}
	}
	//가로로 늘어가는 숫자형
	public void star6() {
		for(int i=0; i<5; i++) {
			for(int j=0;j<5; j++) {
				System.out.print(j+1+i);
		}
			System.out.println();
		}
	}
	//세로로 줄어드는 숫자형
	public void star7() {
		for(int i=0; i<5; i++) {
			for(int j=0;j<5; j++) {
				System.out.print(j-i+5);
		}
			System.out.println();
		}
	}
	//밑으로 커지는
	public void star8() {
		for(int i=0; i<5; i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
		}
			System.out.println();
		}
	}
	//밑으로 작아지는
	public void star9() {
		for(int i=0; i<5; i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
		}
			System.out.println();
		}
	}
	//공백을 이용해 밑으로 작아지는
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
	//공백을 이용해 밑으로 커지는
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
	//if문을 활용해 커졌다 작아졌다
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
	//삼항을 이용한 역모래시계형 별
	public void star122() {
	for(int i=0; i<10; i++) {
		for(int j=0;(i<5)?j<i:j<10-i;j++) {
		System.out.print("*");
	}
	System.out.println();
		}
	}
	//삼항을 이용한 모래시계형 별
	public void star13() {
		for(int i=0; i<9; i++) {
			for(int j=0; (i<5)?j<5-i:j<i-3; j++) {
			System.out.print("*");
		}
		System.out.println();
			}
		}	
}