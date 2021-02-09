package kh.java.control;

public class ForExam2 {
	//피라미드
		public void star16() {
			
			for(int i=0; i<=8; i+=2) {
				for(int j=i; j<8; j+=2) {
					System.out.print(" ");
				}
				for(int k=0; k<=i; k++) {
				System.out.print("*");
				}
				System.out.println();
			}
		}
		//역피라미드
		public void star17() {
			for(int i=8; i>=0; i-=2) {
				for(int j=i; j<8; j+=2) {
					System.out.print(" ");
				}
				for(int k=0; k<=i; k++) {
				System.out.print("*");
				}
				System.out.println();
			}
		}
		//피라미드~역피라미드
		public void star18() {
			for(int i=0; i<=8; i+=2) {
				for(int j=i; j<8; j+=2) {
					System.out.print(" ");
				}
				for(int k=0; k<=i; k++) {
				System.out.print("*");
				}
				System.out.println();
			}
			for(int i=6; i>=0; i-=2) {
				for(int j=i; j<8; j+=2) {
					System.out.print(" ");
				}
				for(int k=0; k<=i; k++) {
				System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public void star19() {
			for(int i=0; i<=8; i+=2) {
				for(int j=i; j<=8; j+=2) {
					System.out.print("*");
				}
				for(int k=0; k<=i; k++) {
				System.out.print(" ");
				}
				for(int j=i; j<=8; j+=2) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=6; i>=0; i-=2) {
				for(int j=i; j<=8; j+=2) {
					System.out.print("*");
				}
				for(int k=0; k<=i; k++) {
				System.out.print(" ");
				}
				for(int j=i; j<=8; j+=2) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public void star20() {
			for(int i=8; i>=0; i-=2) {
				for(int j=i; j<=8; j+=2) {
					System.out.print("*");
				}
				for(int k=0; k<=i; k++) {
				System.out.print(" ");
				}
				for(int j=i; j<=8; j+=2) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=0; i<=8; i+=2) {
				for(int j=i; j<8; j+=2) {
					System.out.print("*");
				}
				for(int k=0; k<=i+2; k++) {
				System.out.print(" ");
				}
				for(int j=i; j<8; j+=2) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public void star21() {
			for(int i=8; i>=0; i-=2) {
				for(int j=i; j<8; j+=2) {
					System.out.print(" ");
				}
				for(int k=0; k<=i; k++) {
				System.out.print("*");
				}
				System.out.println();
			}
			for(int i=2; i<=8; i+=2) {
				for(int j=i; j<8; j+=2) {
					System.out.print(" ");
				}
				for(int k=0; k<=i; k++) {
				System.out.print("*");
				}
				System.out.println();
			}
		}
	}
