package javaPractice;

import java.util.Scanner;

public class JStudy02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		System.out.print("거꾸로 출력하는 정수 : ");
		for(int i=1; i<num; i*=10) {
			sum1 = num%(i*10)/i;
			System.out.print(sum1);
			sum2 += sum1;
			}
		System.out.println("\n모든 숫자의 합 : "+sum2);
		}

}
