package stream;

import java.io.File;
import java.util.Scanner;

public class FileTest {
	public void fileTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϸ��� �Է��ϼ��� : ");
		String fileName = sc.next();
		//try/chatch ����ȭ x
		File file = new File(fileName);
		if(file.exists()) {//exists()-> �ش������� �����ϸ� true/������ false
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("���� ��� ��� : "+file.getPath());
			System.out.println("���� ���� ��� : "+file.getAbsolutePath());
			System.out.println("���� ũ�� : "+file.length()+"byte");
		}else {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}
	}
}
