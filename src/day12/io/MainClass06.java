package day12.io;
/*
 * Try-with-resources
 *  try 코드 블록이 끝나면 자동으로 resources를 종료해주는 기능이다.
 * 
 *  AutoCloseable 상속받은 Resources만 가능!
 * 
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) throws IOException {
		
		File f1 = null;
		File f2 = null;
		try {
			// upload2 폴더 생성
			f1 = new File("./upload2");
			f1.mkdir();
						
			// hello3.txt 파일 생성
			f2 = new File(f1, "hello3.txt");
			f2.createNewFile();
		} catch (Exception e) {
			System.out.println("디렉토리 및 파일 생성 오류");
		}
		
		
		try(
				FileInputStream fis = new FileInputStream("./upload/hello.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream(f2);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				PrintStream ps = new PrintStream(bos, true);
			) {
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			// 파일에서 읽은 데이터를 버퍼에 쓰고, 버퍼가 가득차면 파일에 한 번에 쓰기를 수행함
			while((readByteCnt = bis.read(b)) != -1) {
				bos.write(b, 0 , readByteCnt);
			}
			
			// 버퍼에 남은 데이터를 파일에 쓰고 버퍼를 비움
			bos.flush();
			
			ps.println();
			ps.println("============================");
			ps.print("안녕하세요");
			ps.println("PrintStream으로 작성했어요");
			ps.println("============================");
			
			
			System.out.println("실행 완료");
			
		} catch (Exception e) {
			System.out.println("에러 발생!");
		} 
	}
}
