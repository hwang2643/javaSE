package day07.mypac;

public class M4A1Weapon implements Weapon, Scope {

	@Override
	public void attack() {
		System.out.println("80 데미지 공격");
	}
	
	@Override
	public void doSnipe() {
		System.out.println("1000 거리 저격 공격");
	}
		
}
