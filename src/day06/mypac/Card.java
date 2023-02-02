package day06.mypac;

public class Card {
	// 기본형/전역변수/정적
	public static int width = 62;
	public static int height = 88;
	
	public String type = "Spade";
	public String number = "A";
	
	public String getType() {
		System.out.println(type);
		return type;
	}

}
