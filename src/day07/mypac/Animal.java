package day07.mypac;

public class Animal {
	
	public String name;
	
	//이름 지어주기
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// 움직인다
	public void move() {
		System.out.println("움직인다");
	}

}
