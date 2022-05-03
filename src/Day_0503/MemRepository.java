package Day_0503;

import java.util.HashMap;
import java.util.Map;

public class MemRepository {

	static Map<Long, MemDTO> memberMap = new HashMap<>();

	public void save(Long id, MemDTO md) {
		memberMap.put(id, md);
	}

	public Boolean memberIdCheck(String memberId) {
		boolean check = true;
		for (Long l : memberMap.keySet()) {
			if (memberId.equals(memberMap.get(l).getMemberId())) {
				check = false;
			}
		}
		return check;
	}

	public Boolean loginCheck(String memberId, String memberPassword) {
		boolean check = false;
		for(Long l : memberMap.keySet()) {
			if(memberId.equals(memberMap.get(l).getMemberId())&&memberPassword.equals(memberMap.get(l).getMemberPassword())) {
				check = true;
			}
		}
		return check;
	}

	public Map<Long, MemDTO> findAll() {
		// TODO Auto-generated method stub
		return memberMap;
	}

	public MemDTO findById(Long id2) {
		MemDTO member = null;
		for (Long m : memberMap.keySet()) {
			if (id2.equals(memberMap.get(m).getId())) {
				member = memberMap.get(m);
			}
		}
		return member;
	}

	public void change(String memberId, String memberMobile) {
		for(Long l : memberMap.keySet()) {
			if(memberId.equals(memberMap.get(l).getMemberId())) {
				memberMap.get(l).setMemberMobile(memberMobile);
			}
		}
		
	}

	public Boolean idcheck(Long id) {
		Boolean check = false;
		for(Long l : memberMap.keySet()) {
			if(id.equals(memberMap.get(l).getId())) {
				check = true;
			}
		}
		return check;
	}

	public Map<Long, MemDTO> remove(Long id) {
		for(Long l : memberMap.keySet()) {
			if(id.equals(memberMap.get(l).getId())) {
				memberMap.remove(l);
				break;
			}
		}
		return memberMap;
		
	}

}
