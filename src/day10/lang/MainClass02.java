package day10.lang;

import day10.mypac.KPop;

public class MainClass02 {
	public static void main(String[] args) throws CloneNotSupportedException {
		KPop kpop1 = new KPop();
		KPop kpop2 = kpop1; // 주소값이 같다.
		                    // call by reference
		                    // 얕은 복사(주소갑 복사)
		
		// kpop1 과 kpop2는 같습니다.
		if(kpop1.equals(kpop2)) {
			System.out.println("kpop1 과 kpop2는 같습니다.");
		} else {
			System.out.println("kpop1 과 kpop2는 다릅니다.");
		}
		
		KPop kpop3 = (KPop) kpop1.clone();
		kpop3.musicName = "abcdef";
		System.out.println(kpop3.musicName);
		
		if(kpop1.equals(kpop3)) {
			System.out.println("kpop1 과 kpop3는 같습니다.");
		} else {
			System.out.println("kpop1 과 kpop3는 다릅니다.");
		}
	}

}
