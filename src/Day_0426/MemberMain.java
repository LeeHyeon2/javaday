package Day_0426;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Member member1 = new Member(1L, "id1", "1234", "kim", "010", 10);
		Member member2 = new Member();
		member2.id = 2L;
		member2.memberId = "id2";
		member2.memberPassword = "1234";
		member2.memberPassword = "lee";
		member2.memberPhone = "011";
		member2.memberAge = 20;

		// 조회
		System.out.println(member1.id);
		System.out.println(member1.memberId);
		
		// 조회 (메소드 호출)
		member1.findById();
		member2.findById();
		
		System.out.print("아이디 : ");
		String memberId = scan.next();
		System.out.print("비밀번호 : ");
		String memberPassword = scan.next();
		boolean loginResult = member1.memberLogin(memberId,memberPassword);
		if(loginResult) {
			System.out.println("로그인성공");
		}else {
			System.out.println("아이디 또는 비밀번호를 확인하세요");
			
		}
		
		System.out.println("변경할 전화번호: ");
		String memberPhone = scan.next();
		member1.update(memberPhone);
		member1.findById();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
