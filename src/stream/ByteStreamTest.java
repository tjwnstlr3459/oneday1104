package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamTest {

	public void primaryStream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명을 입력하세요 : ");
		String fileName = sc.next();
		sc.nextLine();	//버퍼 엔터제거
		
		FileOutputStream fis = null;	
		//프로그램->파일로 데이터를 전송하는 객체
		
		try {
			//입력받은 파일명으로 파일생성->생성된 파일과 Stream연결
			fis = new FileOutputStream(fileName);
			System.out.println("["+fileName+"] 파일에 저장될 내용 입력");
			System.out.println("종료는 exit");
			int lineNumber = 1;
			while(true) {
				System.out.print((lineNumber++)+" : ");
				String str = sc.nextLine()+"\r\n";	
				//\r\n ->window개행처리 문자를 더해줌
				if(str.equals("exit\r\n")){
					break;
				}
				//파일에 입력받은 값을 쓰는 메소드
				//getBytes() -> 문자열을 바이트배열로 변환
				fis.write(str.getBytes());	
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();	//끝맺음 반환을 해줘야 다른곳에서도 사용가능
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}





















