package kh.java.control;

public class ForExam {

	public void exam1() {
		//가로로 구구단 출력
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d*%d=%d\t",i,j,i*j);
			}
			System.out.println();
		}
	}
	
		//세로로 구구단 출력
	public void exam2() {
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.printf("%d*%d=%d\t",j,i,i*j);
			}
			System.out.println();
		}
	}
	public void star1() {
		for(int i=0;i<5;i++) {
			System.out.print("*");
		}
	}
	
	public void star2() {
		for(int i=0;i<5;i++) {
			System.out.println("*");
		}
	}
	
	public void star3() {
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
		}
			System.out.println();
		}
	}
	
	public void star4() {
		for(int i=1; i<6; i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i);
		}
			System.out.println();
		}
	}
	
	public void star5() {
		for(int i=1; i<6; i++) {
			for(int j=1;j<6;j++) {
				System.out.print(j);
		}
			System.out.println();
		}
	}
	
	public void star6() {
		for(int i=1; i<6; i++) {
			for(int j=i;j<i+5; j++) {
				System.out.print(j);
		}
			System.out.println();
		}
	}
	
	public void star7() {
		for(int i=5; i>0; i--) {
			for(int j=i; j<i+5; j++) {
				System.out.print(j);
		}
			System.out.println();
		}
	}
	
	
	public void star8() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void star9() {
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
		}
	}
	
	public void star10() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=5; k>i; k--)
			System.out.print("*");
			System.out.println();
		}
	}
	public void star11() {
		for(int i=0; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			System.out.print("*");
			System.out.println();
		}
	}
	public void star12() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void star13() {
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
