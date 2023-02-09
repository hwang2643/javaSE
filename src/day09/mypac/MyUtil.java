package day09.mypac;

public class MyUtil {
	public String name = "MyUtil";
	public static String staticName = "마이유틸";
	
	// 내부클래스
	public class HelloPrinter {
		// 메소드
		public void printHello() {
			System.out.println(name);
			System.out.println(staticName);
			System.out.println("내부클래스의 HelloPrinter 입니다.");
		}
	}
	
	// static 내부클래스
	public static class Calculater {
		// 메소드
		public void calc(int a, int b) {
			int result = a + b;
			System.out.println("전달받은 두 정수의 합" +result);
			System.out.println("static 내부 클래스 Calculater 입니다.");
			System.out.println(staticName);
		}
	}

}
