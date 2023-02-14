package day10.mypac;

public class car {
	public String model;
	public String color;
	
	public car() {
		this.model = "카니발";
	}
	
	public car(String model) { // 오버로딩
		this.model = model;
	}
	@Override
	public String toString() {
		
		return model;
	}
}
