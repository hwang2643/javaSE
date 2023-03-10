package day11.util;

import java.util.Calendar;

/*
 * [[ Calendar Class ]]
 *  - 날짜 관련 객체
 *  - 날짜 계산용으로 자주사용
 *  - Date 객체와 호환 가능
 * 
 */

public class MainClass08 {
	public static void main(String[] args) {
		// Calendar 객체 생성 
		// getInstence 메소드 통해서만 객체 생성
		Calendar calNow = Calendar.getInstance();
		
		int year = calNow.get(Calendar.YEAR);
		System.out.println("올 해 : " + year);
		
		int month = calNow.get(Calendar.MONTH) + 1;
		System.out.println("월 : " + month);
		
		int day = calNow.get(Calendar.DAY_OF_MONTH);
		System.out.println("일 : " + day);
		
		int hour = calNow.get(Calendar.HOUR_OF_DAY);
		int min = calNow.get(Calendar.MINUTE);
		int sec = calNow.get(Calendar.SECOND);
		System.out.println(hour + ":" + min + ":" + sec);
		
		
	}

}
