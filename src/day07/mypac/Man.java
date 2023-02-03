package day07.mypac;

public class Man extends Human {

	@Override
	public void usefire() {
		System.out.println("고기를 구워요!");
		
	}
	
	@Override
	public void say() {
		System.out.println("굵은 목소리로");
		super.say();
	}
	

}
