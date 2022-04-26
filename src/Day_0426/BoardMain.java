package Day_0426;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Board board = new Board();
		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("1.글작성 || 2.글조회 || 3.글수정 || 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택 > ");
			int choice = scan.nextInt();

			if (choice == 1) {
				board.save();
			} else if (choice == 2) {
				System.out.print("글번호 선택 : ");
				board.findbyId();
			} else if (choice == 3) {
				System.out.print("수정할 게시글 번호 입력 :");
				board.boardNumCheck = scan.nextInt();
				System.out.print("수정할 게시글의 비밀번호 입력 :");
				board.boardPasswordCheck = scan.next();
				boolean check = board.update();
				if (check) {
					System.out.println("성공적으로 바뀌었습니다.");
				} else {
					System.out.println("게시글과 비밀번호가 일치하지 않습니다.");
				}
			} else if (choice == 4) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("올바른 숫자를 입력해 주세요.");
			}

		}

	}

}
