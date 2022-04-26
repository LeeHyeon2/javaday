package Day_0425;

import java.util.Scanner;

public class Member {
	Scanner scan = new Scanner(System.in);
	
	int memberNum = 0;
	String id = "";
	int password = 0 ;
	String name = "";
	String phone = "";
	int age = 0;
	
	Member(){
		
	}
	
	
	boolean memberLogin(String idcheck , int passwordcheck) {
		System.out.print("id 입력 : ");
		idcheck = scan.next();
		System.out.print("password 입력 : ");
		passwordcheck = scan.nextInt();
		if(idcheck.equals(this.id) && passwordcheck == this.password) {
			System.out.println("로그인 성공");
			return true;
		}else {
			System.out.println("로그인 실패");
			return false;
		}
	}
	
	
	void findbyld() {
		System.out.println("회원 번호 : " + this.memberNum);
		System.out.println("id :  " + this.id);
		System.out.println("passward : " + this.passward);
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phone);
		System.out.println("나이 : " + this.age);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
