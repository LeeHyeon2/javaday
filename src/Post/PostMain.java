package Post;

import java.util.Scanner;

public class PostMain {

	public static void main(String[] args) {
		// 1. 프로그램을 실행하면 아래와 같은 메뉴가 출력되고 각 메뉴의 숫자를 입력하면 해당 기능을 실행할 수 있다. 모든 기능은 처리가 끝난 후
		// 다시 메인 메뉴가 출력되도록 한다.
		// 1. 글작성
		// 2. 글목록
		// 3. 글조회
		// 4. 글수정
		// 5. 글검색
		// 6. 글삭제
		// 7. 종료
		Scanner scan = new Scanner(System.in);
		PostService ps = new PostService();
		do {

			System.out.println("------------------------------------------------------------");
			System.out.println("1.글작성 | 2.작성자 목록 | 3.글조회 | 4.글수정 | 5.글검색 | 6.글삭제 | 7.종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택 > ");
			int choice = scan.nextInt();

			if (choice == 1) {
				ps.save();
			} else if (choice == 2) {
				ps.findAll();
			} else if (choice == 3) {
				ps.findById();
			} else if (choice == 4) {
				ps.change();
			} else if (choice == 5) {
				ps.findWriter();
			} else if (choice == 6) {
				ps.remove();
			} else if (choice == 7) {
				System.out.println("종료합니다.");
			} else {
				System.out.println("올바른 숫자를 입력 해 주세요.");
			}
		} while (true);

	}

}
