package day08.accessmodifier;

import day08.vo.MemberVO;

public class MainClass02 {
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		
		memberVO.setID("abdc");
		memberVO.setPassword("abcd1234!@#");
		memberVO.setName("알파벳");
		memberVO.setPhoneNumber("01012345678");
		memberVO.setEmail("abc@abcd.com");
		memberVO.setAddress("서울특별시 여의도");
		memberVO.setBirth("970312");
		
		System.out.println("ID : " + memberVO.getID());
		System.out.println("패스워드 : " + memberVO.getPassword());
	}

}
