package Day_0425;

import java.util.Scanner;

public class Day_0425_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		Member mem = new Member();
		boolean login = false;
		
		do {
			System.out.println("1.회원가입 || 2.로그인 || 3.회원정보조회 || 4.전화번호수정 || 5.종료");
			System.out.print("선택 > ");
			choice = scan.nextInt();
			if (choice == 1) {
				mem.memberNum = scan.nextInt();
				mem.id = scan.next();
				mem.password = scan.nextInt();
				mem.name = scan.next();
				mem.phone = scan.next();
				mem.age = scan.nextInt();

			} else if (choice == 2) {
				login = mem.memberLogin(mem.id, mem.password);
			} else if (choice == 3) {
				if(login == true) {
					mem.findbyld();					
				}else {
					System.out.println("로그인 부터 해주세요");
				}
			} else if (choice == 4) {
				if(login == true) {
					System.out.print("전화번호 변경 >");
					mem.phone = scan.next();
					mem.findbyld();					
				}else {
					System.out.println("로그인 부터 해주세요");
				}
			} else {
				System.out.println("종료");
				break;
			}
		} while (true);
	}

}
