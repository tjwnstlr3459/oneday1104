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
		for(int i = 1; i <= 7; i++) { // �� 10���� ����ϱ� ���� �ݺ����Դϴ�.
	        if(i <= 7/2 + 1) {
	           for(int j = 0; j < i; j++) // ���ٿ� ���� i �� ��ŭ ��� ���� j�� �̿��� �ݺ��ϴ� �ݺ����Դϴ�.
	               System.out.print("*"); // �� ���
	        } 
	        else {
	        for(int j = 0; j < 7-i+1; j++) // ���ٿ� ���� ��µ� ���ҵǴ�..
	               System.out.print("*"); // �� ���
	        }
	            System.out.println(""); // ���� ��ŭ�� ���� ����� enter! 
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