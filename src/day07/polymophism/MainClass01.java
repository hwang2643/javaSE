package day07.polymophism;
/*
 * [[ 다형성 (polymophism) ]]
 *  하나의 객체가 여러가지 타입을 가질 수 있는 것을 의미한다.
 * 
 * instanceof 연산자
 *  객체가 특정 클래스 상속여부 boolean으로 반환
 * 
 */

import day07.mypac.AkWeapon;
import day07.mypac.M16;
import day07.mypac.M4A1Weapon;
import day07.mypac.Scope;
import day07.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		AkWeapon ak = new AkWeapon();
		ak.attack();
		ak.doSnipe();
		
		Weapon m4a1 = new M4A1Weapon();
		m4a1.attack();
		
		M4A1Weapon m4a1Real = (M4A1Weapon)m4a1;
		
		m4a1Real.attack();
		m4a1Real.doSnipe();
		
		// m4a1 m4a1Real 같을까요? 다를까요? 정답은 같다!
		
		System.out.println(System.identityHashCode(m4a1));
		System.out.println(System.identityHashCode(m4a1Real));
		System.out.println(System.identityHashCode(ak));
		
		// m4a1 m4a1Real 같은데 왜? m4a1은 doSnipe 안되는가? => 다형성 때문에!
		
		M16 m16 = new M16();
		
		classifyWeapon(m16);
		classifyWeapon(m4a1);
		classifyWeapon(m4a1Real);
		classifyWeapon(ak);
		
	}
	
	
	
	public static void classifyWeapon(Weapon weapon) {  // Weapon weapon = m16
		if (weapon instanceof Scope) {
			System.out.println("저격소총 입니다");
		} else {
			System.out.println("일반소총 입니다.");
		}
	}

}
