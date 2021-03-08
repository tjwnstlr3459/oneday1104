package stream;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StreamTest {
	public void imageStream() {
		//quiz.txt���Ͽ� �ִ� ���� �о�������� ������Ʈ��
		BufferedReader br = null;
		
		//�о�������� ��ȯ�ؼ� �̹������Ϸ� ������������ ����Ʈ����
		BufferedOutputStream bos = null;
		//FileReader fr = new FileReader("quiz.txt");
		try {
			//quiz.txt���Ͽ��� �����͸� �о���� ���� �ֽ�Ʈ�� ����
			FileReader fr = new FileReader("quiz.txt");
			//��ɰ����� ���� ������Ʈ�� ����
			br = new BufferedReader(fr);
			String str = br.readLine();
			//�о�� ���� �̹������Ϸ� ������������ �ֽ�Ʈ�� ����
			FileOutputStream fos = new FileOutputStream("test.gif");
			//������ ������������ ������Ʈ�� ����
			bos = new BufferedOutputStream(fos);
			
			ArrayList<Byte> al = new ArrayList<Byte>();
			StringTokenizer sT = new StringTokenizer(str," ");
			while(sT.hasMoreTokens()) {
				String num = sT.nextToken();
				//String a = "a"; <--������
				int iNum = Integer.parseInt(num,16); //�������� ����������
				al.add((byte)iNum);
			}
			for (Byte b : al) {
				bos.write(b);
			}
			System.out.println("���� �������� �Ϸ�");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
