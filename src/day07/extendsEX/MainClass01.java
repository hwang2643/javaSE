package day07.extendsEX;

import day07.mypac.Cat;
import day07.mypac.PersianCat;

/*
 * [[ 상속 ]]
 *  부모 클래스(상위 클래스)외 자식 클래스(하위 클래스)가 있으며,
 *  자식 클래스는 부모 클래스를 선택해서,
 *  그 부모의 멤버를 상속 받아 쓸 수 있게 된다.
 *  
 *  클래스 1개당 상속 1개
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		
		
		//고양이 이름 지어주기
		Cat cat = new Cat();  //  Cat객체생성
		cat.setName("프린세스");  //  Cat 이름 '프린세스' 입력
//		String catName = cat.getName();
//		System.out.println(catName);
		System.out.println(cat.getName());  //  '프린세스' 출력
		cat.move();  //  cat move 호출
		cat.likechur();  //  cat likechur 호출
		
		System.out.println( );
		
		PersianCat pCat = new PersianCat();  //  PersianCat 객체 생성
		pCat.setName("프린스");  //  pCat 이름 '프린스' 입력
		System.out.println(pCat.getName());  //  '프린스' 출력
		pCat.move();  //  pCat move 호출
		pCat.likechur();  //  pCat likechur 호출
		pCat.getColor();  //  pCat color 호출
		pCat.species();
		
		
		
		//모든 클래스의 최상위 부모이다.
		Object obj = new Object();
		
	}

}
