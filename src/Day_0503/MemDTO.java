package Day_0503;

public class MemDTO {

	private Long id;
	private String memberId;
	private String memberPassword;
	private String memberName;
	private Long memberAge;
	private String memberMobile;

	MemDTO(){
		
	}

	public MemDTO(Long id, String memberId, String memberPassword, String memberName, Long memberAge,
			String memberMobile) {
		this.id = id;
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberMobile = memberMobile;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Long getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(Long memberAge) {
		this.memberAge = memberAge;
	}

	public String getMemberMobile() {
		return memberMobile;
	}

	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}

	@Override
	public String toString() {
		return "회원정보 [관리번호 = " + id + ", 회원 id = " + memberId + ", 비밀번호 = " + memberPassword + ", 이름 = " + memberName
				+ ", 나이 = " + memberAge + ", 전화번호 = " + memberMobile + "]";
	}

}
