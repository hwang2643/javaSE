package day07.mypac;

public class CreamBread extends Bread {
	public CreamBread() {
		super();	// 자식클래스에서 부모 생성자 호출(항상 제일 윗줄)
		super.breadName = "크림빵";
		super.breadPrice = 2000;
	}

}