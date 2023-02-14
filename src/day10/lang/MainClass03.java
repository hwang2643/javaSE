package day10.lang;import java.util.IdentityHashMap;

/*
 * [[ 래퍼 클래스(Wrapper Class ]]
 *  8개의 기본타입에 해당하는 데이터를 객체로 표현
 *  boolean, byte, char, short, int, long, float, double
 * 
 * 
 */

public class MainClass03 {
	public static void main(String[] args) {
		
		boolean b1 = true;  // 기본형 변수
		Boolean b2 = new Boolean(true); 
		Boolean b3 = new Boolean(true);
		
		Boolean b4 = Boolean.valueOf("true");
		
		if(b4) {
			System.out.println("b4는 true 입니다.");
		}else {
			System.out.println("b4는 false 입니다.");
		}
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		// int Wrapper Class
		Integer number1 = new Integer(10);
		Integer number2 = new Integer(10);
		int number3 = 10;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		
		System.out.println("number1 == number3: " + (number1 == number3));
		System.out.println("number1 == number2: " + (number1 == number2));
		System.out.println("number1.equals(number2): " + (number1.equals(number2)));
		System.out.println(System.identityHashCode(number1));
		System.out.println(System.identityHashCode(number2));
//		System.out.println(System.identityHashCode(number3));
		
		if(number1.equals(number2)) {
			System.out.println("number1 과 number2는 같습니다");
		} else {
			System.out.println("number1 과 number2는 다릅니다");
		}
		
//		String str1 = "Hello";
//		String str2 = "Hello";
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		str1 = null;
		if(str1 != null && str1.equals(str2)) {
			System.out.println("str1 과 strr2는 같습니다");
		} else {
			System.out.println("str1 과 str2는 다릅니다");
		}
		
		int num1 = Integer.parseInt("1000");
		int num2 = Integer.parseInt("2000");
		
		System.out.println(num1 + num2);
		
	}

}
