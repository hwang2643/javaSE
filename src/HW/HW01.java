package HW;

public class HW01 {
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
			for(int j = 6; j>=0 ; j--) {
				if(i<j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for(int j = 1; j<i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		// 4번
		System.out.println("4번");
		for(int i = 0; i<7; i++) {
			for(int j = 6; j>=0 ; j--) {
				if(i<j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for(int j = 1; j<i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();		
		}
		for(int i =0; i<7; i++) {
			for(int j = 0; j<=6; j++) {
				if(i<j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j = 5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}