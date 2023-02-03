package day07.mypac;

public class Cat extends Animal {
	@Override
	public void move() {
		super.move();
		System.out.println("점프를 뛴다!");
		
	}
	
	public void likechur() {
		System.out.println("츄르를 좋아한다!");
	}

}
