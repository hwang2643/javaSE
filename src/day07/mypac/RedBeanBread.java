package day07.mypac;

public class RedBeanBread extends Bread {
	public RedBeanBread() {
		super();	// 자식클래스에서 부모 생성자 호출(항상 제일 윗줄)
		super.breadName = "팥빵";
		super.breadPrice = 1500;
	}
}
