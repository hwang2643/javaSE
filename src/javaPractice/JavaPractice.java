package javaPractice;

public class JavaPractice {
	public static void main(String[] args) {
		// 3-2
//		int numOfApples = 151; // 사과의 개수
//		int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
//		int numOfBucket = (numOfApples%sizeOfBucket==0 ? numOfApples/sizeOfBucket : (numOfApples/sizeOfBucket)+1); // 모든 사과를 담는데 필요한 바구니의 수
//		System.out.println("바구니의 수 :"+numOfBucket);
		
		// 3-3
//		int num = 10;
//		System.out.println(num>0 ? "양수" : num<0 ? "음수" : 0);
		
		// 3-4
//		int num1 = 456;
//		System.out.println(num1-(num1%100));
		
		// 3-5
//		int num2 = 555;
//		System.out.println(num2 - num2%10 + 1);
		
		// 3-6
//		int num3 = 24;
//		System.out.println((num3/10+1)*10);
//		System.out.println((num3/10+1)*10 - num3);
		
		// 3-7
//		int fahrenheit = 100;
//		float celcius = (((float)fahrenheit-32)*5/9);
//		System.out.println("Fahrenheit:"+fahrenheit);
//		System.out.println("Celcius:"+celcius);
		
		// 3-8
//		byte a = 10;
//		byte b = 20;
//		int c = a + b;
//		char ch = 'A';
//		ch =(char)(ch + 2);
//		float f = 3 / 2f;
//		long l = 3000l * 3000l * 3000l;
//		float f2 = 0.1f;
//		double d = 0.1f;
//		boolean result = d==f2;
//		System.out.println("c="+c);
//		System.out.println("ch="+ch);
//		System.out.println("f="+f);
//		System.out.println("l="+l);
//		System.out.println("result="+result);
		
		// 3-9
//		char ch1 = 'a';
//		int n =(int)'0';
//		System.out.println(n);
//		boolean b1 = ((int)'0'<=(int)ch1 && (int)'9'>=(int)ch1 ? true : (int)'A'<=(int)ch1 && (int)'Z'>=(int)ch1 ? true : (int)'a'<=(int)ch1 && (int)'z'>=(int)ch1 ? true : false);
//		System.out.println(b1);
		
		// 3-10
//		char ch2 = 'C';
//		char lowerCase = ((int)'A'<=(int)ch2 && (int)'Z'>=(int)ch2) ? (char)(ch2+32) : ch2;
//		System.out.println("ch:"+ch2);
//		System.out.println("ch to lowerCase:"+lowerCase);
		
		
//		[4-1] 다음의 문장들을 조건식으로 표현하라.
//		1.
//		int x = 15;
//		boolean b2 = (x > 10 && x < 20 ? true : false);
//		System.out.println(b2);
//		2.
//		char ch3 = ' ';
//		if(ch3 != ' ' || ch3 != '	') {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
//		3.
//		char ch4 = 'a';
//		if(ch4 == 'x' || ch4 == 'X') {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		4. 
//		char ch5 = '4';
//		if((int)ch5 >= (int)'0' && (int)ch5 <= (int)'9') {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		5.
//		char ch6 = ' ';
//		if((int)ch6 >= (int)'a'&& (int)ch6 <=(int)'z' || (int)ch6 >= (int)'A'&& (int)ch6 <=(int)'Z') {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		char ch6 = 'c';
//		if(ch6 >= 'a'&& ch6 <='z' || ch6 >= 'A'&& ch6 <='Z') {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		6. 
//		int year = 4000;
//		if((year%400==0 || year%4==0) && year%100!=0) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		7. 
//		boolean powerOn = false;
//		if(powerOn == false) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
		
//		8. 
//		String str = "";
//		if(str == "yes") {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
		
		// 4-2
//		int sum = 0;
//		for(int i = 1; i <= 20; i++) {
//			if(i%2!=0 && i%3!=0) {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
		
		// 4-3
//		int sum1 = 0;
//		int sum2 = 0;
//		for(int i = 1; i <= 10; i++) {
//			for(int j = 2; j <= i; j++) {
//				sum2 = sum2 +   j;
//			}
//			sum1 = i + sum2;
//		}
//		System.out.println(sum1);
		
		// 4-4
		
		
		// 4-6
//		int n1;
//		int n2;
//		for(n1 = 1; n1<=6; n1++) {
//			for(n2 = 1; n2<=6; n2++) {
//				
//				if(n1+n2==6) {
//					System.out.println("첫 번째 주사위 : " + n1);
//					System.out.println("두 번째 주사위 : " + n2);
//					break;
//				}
//			}
//		}
		
		// 4-7
		int value = (int)(Math.random()*6)+1;
		System.out.println("value:"+value);
		
		// 4-8
		int x;
		int y;
		for(x = 0; x <= 10; x++) {
			for(y = 0; y <= 10; y++) {
				if((2*x) + (4*y) == 10) {
					System.out.println("x=" + x + ", y=" + y);
					break;
				}
			}
		}
		
		// 4-9
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
			sum += (str.charAt(i)-'0');
		}
		System.out.println("sum="+sum);
	}
	

}
