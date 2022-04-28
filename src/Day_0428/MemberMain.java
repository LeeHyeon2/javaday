package Day_0428;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("--------------------------------------");
			System.out.println("1.회원가입 2.로그인 3.회원목록 4.상세조회 5.회원정보수정 6.회원삭제 7.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택>");
			int choice = scan.nextInt();
			MemberService ms = new MemberService();

			if (choice == 1) {
				ms.save();
			} else if (choice == 2) {
				ms.login();
			} else if (choice == 3) {
				ms.findAll();
			} else if (choice == 4) {
				ms.findById();
			} else if (choice == 5) {
				ms.change();
			} else if (choice == 6) {
				ms.remove();
			} else if (choice == 7) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("올바른 숫자를 입력 해 주세요");
			}

		} while (true);

	}

}
