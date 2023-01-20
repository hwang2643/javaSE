package day04.loop;
/*
 * 중첩반복문 가능하다
 * 
 */

public class MainClass04 {
	public static void main(String[] args) {
		// 1번
		System.out.println("1번");
		for(int i = 0; i<7; i++) {
			for(int j = 0; j<i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 2번
		System.out.println("2번");
		for(int i = 0; i<7; i++) {
			for(int j = 6; j>i-1 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		// 3번
		System.out.println("3번");
		for(int i = 0; i<7; i++) {
			for(int j = 0; j<i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
