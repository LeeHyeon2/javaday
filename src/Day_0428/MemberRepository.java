package Day_0428;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
	static List<MemberDTO> memberList = new ArrayList<>();

	void save(MemberDTO md) {
		memberList.add(md);
		for (int i = 0; i < memberList.size(); i++) {
			memberList.get(i).setId((long) (i + 1));
		}
		
	}

	Boolean loginCheck(String memberId, String memberPassword) {
		boolean loginCheck = false;
		for (int i = 0; i < memberList.size(); i++) {
			if (memberId.equals(memberList.get(i).getMemberId())
					&& memberPassword.equals(memberList.get(i).getMemberPassword())) {
				loginCheck = true;
			}
		}

		return loginCheck;
	}

	List<MemberDTO> findAll() {

		return memberList;
	}

	MemberDTO findById(Long id) {
		MemberDTO member = null;
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId())) {
				member = memberList.get(i);
			}
		}
		return member;
	}

	void change(String memberId, String memberMobile) {
		for (int i = 0; i < memberList.size(); i++) {
			if (memberId.equals(memberList.get(i).getMemberId())) {
				memberList.get(i).setMemberMobile(memberMobile);
			}
		}

	}

	List<MemberDTO> remove(Long id) {
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId())) {
				memberList.remove(i);
			}
		}
		return memberList;

	}

	Boolean idcheck(Long id) {
		Boolean check = false;
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId())) {
				check = true;
			}
		}
		return check;
	}

	Boolean memberIdCheck(String memberId) {
		Boolean memberIdCheck = true;
		for (int i = 0; i < memberList.size(); i++) {
			if (memberId.equals(memberList.get(i).getMemberId())) {
				memberIdCheck = false;
			}
		}
		return memberIdCheck;
	}

}
