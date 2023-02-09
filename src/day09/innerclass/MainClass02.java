package day09.innerclass;

import day09.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		// MyUtil 클래스 안에 있는 HelloPrinter 클래스 객체 생성하기
		// 첫 번째 방법
		MyUtil myUtil = new MyUtil();
		System.out.println(myUtil.name);
		System.out.println(myUtil.staticName);
		MyUtil.HelloPrinter hp = myUtil.new HelloPrinter();
		
		hp.printHello();
		
		// 두 번째 방법
		MyUtil.HelloPrinter hp2 = new MyUtil().new HelloPrinter();
		
		// static 내부클래스 생성및 호출
		MyUtil.Calculater calc = new MyUtil.Calculater();
		calc.calc(10, 20);
	}

}
