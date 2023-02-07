package day07.mypac;
/*
 * TODO 빵 집
 * 1. 빵종류
 * 2. 케이크종류 
 * 3. 음료
 * 
 * 4. 빵 굽기
 * 5. 카페
 * 6. 카운트
 * 
 */

public class Bakery {
	// 빵류 객체
	public Bread[] bread;
	
	// 케이크류 객체
	public Cake[] cake;
	
	// 커피류 객체
	public Coffee[] coffee;
	
	public Bakery(Bread[] bread, Cake[] cake, Coffee[] coffee) {
		this.bread = bread;
		this.cake = cake;
		this.coffee = coffee;
		System.out.println("빵집 오픈하였습니다.");
	}
	
	public static void main(String[] args) {
		CreamBread cb = new CreamBread();
//		System.out.println("빵 이름 : " + cb.breadName);
//		System.out.println("빵 가격 : " + cb.breadPrice);
		
		RedBeanBread rbb = new RedBeanBread();
//		System.out.println("빵 이름 : " + rbb.breadName);
//		System.out.println("빵 가격 : " + rbb.breadPrice);
		
		ChocoCake cc = new ChocoCake();
//		System.out.println("케이크 이름 : " + cc.cakeName);
//		System.out.println("케이크 가격 : " + cc.cakePrice);
		
		Bread[] breadArry = new Bread[2];
		breadArry[0] = cb;
		breadArry[1] = rbb;
		
		Cake[] cakeArry = new Cake[1];
		cakeArry[0] = cc;
		
		Bakery parisBaguette = new Bakery(breadArry, cakeArry, null);
		
		for(Bread bread: parisBaguette.bread) {
			System.out.println(bread.breadName + " 가격 : " + bread.breadPrice + "입니다");
		}
		
//		for(int i=0; i < parisBaguette.bread.length; i++) {
//			Bread bread = parisBaguette.bread[i];
//			System.out.println(bread.breadName + " 가격 : " + bread.breadPrice + "입니다");
//		}
		
		for(Cake cake: parisBaguette.cake) {
			System.out.println(cake.cakeName + " 가격 : " + cake.cakePrice + "입니다");
		}
		
//		System.out.println("크림빵 가격 : " + cb.breadPrice);
//		System.out.println("팥빵 가격 : " + rbb.breadPrice);
//		System.out.println("초코케이크 가격 : " + cc.cakePrice);

		
	}

}
