package Day_0428;

import java.util.List;
import java.util.Scanner;

public class MemberService {
	Scanner scan = new Scanner(System.in);
	MemberRepository mr = new MemberRepository();

	void save() {
		System.out.print("아이디 입력 : ");
		String memberId = scan.next();
		Boolean memberIdCheck = mr.memberIdCheck(memberId);
		if (memberIdCheck) {
			Long id = 0l;
			System.out.print("비밀번호 입력 : ");
			String memberPassword = scan.next();
			System.out.print("이름 입력 : ");
			String memberName = scan.next();
			System.out.print("나이 입력 : ");
			Long memberAge = scan.nextLong();
			System.out.print("전화번호 입력 :");
			String memberMobile = scan.next();
			System.out.println("회원가입 완료.");
			MemberDTO md = new MemberDTO(id, memberId, memberPassword, memberName, memberAge, memberMobile);
			mr.save(md);
		} else {
			System.out.println("이미 등록 되어 있는 아이디 입니다.");
		}
	}

	void login() {
		System.out.print("로그인 할 아이디 입력 : ");
		String memberId = scan.next();
		System.out.print("로그인 할 비밀번호 입력 : ");
		String memberPassword = scan.next();
		Boolean loginCheck = mr.loginCheck(memberId, memberPassword);
		if (loginCheck) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
		}
	}

	void findAll() {
		List<MemberDTO> memberList = mr.findAll();
		for (MemberDTO m : memberList) {
			System.out.println(m);
		}

	}

	void findById() {
		System.out.print("조회하고 싶은 회원의 관리번호 입력 : ");
		Long id = scan.nextLong();
		MemberDTO member = mr.findById(id);
		if (member == null) {
			System.out.println("존재하지 않는 회원번호 입니다.");
		}else {
			System.out.println(member);
		}

	}

	void change() {
		System.out.print("수정할 아이디 입력 : ");
		String memberId = scan.next();
		System.out.print("수정할 아이디의 비밀번호 입력 : ");
		String memberPassword = scan.next();
		Boolean loginCheck = mr.loginCheck(memberId, memberPassword);
		if (loginCheck) {
			System.out.print("바꿀 전화번호 입력 : ");
			String memberMobile = scan.next();
			mr.change(memberId, memberMobile);
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
		}
	}

	void remove() {
		System.out.print("삭제할 회원의 관리번호 입력 : ");
		Long id = scan.nextLong();
		Boolean idcheck = mr.idcheck(id);
		if (idcheck) {
			List<MemberDTO> memberList = mr.remove(id);
			//삭제 후 목록 조회
			for (MemberDTO m : memberList) {
				System.out.println(m);
			}
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}
	}

}
