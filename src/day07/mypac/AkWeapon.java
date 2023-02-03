package day07.mypac;

public class AkWeapon implements Weapon, Scope {

	@Override
	public void attack() {
		System.out.println("소총 공격을 해요!");		
	}

	@Override
	public void doSnipe() {
		System.out.println("저격을 해요!");		
	}

}
