package day09.thread;

/*
 * synchronized - 동기화를 시켜주는 예약어
 * 
 */

import day09.mypac2.Brother;
import day09.mypac2.Sister;
import day09.mypac2.wallet;

public class MainClass04 {
	public static void main(String[] args) {
		// wallet 객체 생성하기
		wallet wallet = new wallet();
		
		// Sister 스레드 객체 생성하기
		Sister sister = new Sister(wallet);
		
		// Brother 스레드 객체 생성하기
		Brother brother = new Brother(wallet);
		
		//각각의 객체를 이용해서 두개의 스레드 시작시키기
		sister.start();
		brother.start();
		
		System.out.println("메인 스레드가 종료됩니다.");
	}
	

}
