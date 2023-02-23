package day12.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileReader - 문자파일을 읽을 수 있는 기능 제공 클래스
 * 
 * FileWriter - 문자를 파일에 쓸 수 있는 기능 제공 클래스
 * 
 */

public class MainClass04 {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("./upload/hello.txt");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("./upload/hello4.txt");
			bw = new BufferedWriter(fw);
			
//			int readCharCnt = 0;
//			char[] c = new char[2];
//			
//			int i = 1;
			
//			while ((readCharCnt = br.read(c)) != -1) {
//				bw.write(c, 0 , readCharCnt);
//				System.out.println(i + " : " + new String(c, 0, readCharCnt));
//				++i;
//			}
			
			// 파일에서 한 줄씩 읽어서 출력하는 방법
			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			System.out.println("실행 완료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(bw != null) bw.close();
			if(br != null) br.close();
			if(fw != null) fw.close();
			if(fr != null) fr.close();
		}
	}

}
