package Day_0426;

import java.util.Scanner;

public class Board {
	Scanner scan = new Scanner(System.in);
	boolean check = false;
	int findboardNum = 0;
	int boardNumCheck;
	String boardPasswordCheck;
	int[] boardNum = new int[20];
	String[] boardPassword = new String[20];
	String[] boardTitle = new String[20];
	String[] name = new String[20];
	String[] main = new String[20];
	int[] up = new int[20];
	int i = 0;

	Board() {

	}

	// 게시물 작성
	void save() {
		System.out.println("게시글 등록번호 :" + (i + 1));
		this.boardNum[i] = i + 1;
		System.out.print("게시글 비밀번호 입력 :");
		this.boardPassword[i] = scan.next();
		System.out.print("게시글 제목 입력 :");
		this.boardTitle[i] = scan.next();
		System.out.print("게시글 작성자 입력 :");
		this.name[i] = scan.next();
		System.out.print("게시글 내용 입력:");
		this.main[i] = scan.next();
		this.up[i] = 0;
		this.i++;
	}

	void findbyId() {
		findboardNum = scan.nextInt();
		for (int j = 0; j < this.boardNum.length; j++) {
			if (this.boardNum[j] == this.findboardNum) {
				this.up[j] += 1;
				System.out.println("글 번호 : " + boardNum[j]);
				System.out.println("글 제목 : " + boardTitle[j]);
				System.out.println("글 작성자 : " + name[j]);
				System.out.println("글 내용 : " + main[j]);
				System.out.println("조회수 : " + up[j]);
				break;
			}
			if (this.boardNum.length - 1 == j) {
				System.out.println("등록되지 않은 게시물 번호입니다");
				break;
			}
		}
	}

	boolean update() {
		for (int j = 0; j < this.boardNum.length; j++) {
			for (int k = 0; k < this.boardNum.length; k++) {
				if (boardNum[j] == boardNumCheck) {
					if (boardPasswordCheck.equals(boardPassword[k])) {
						System.out.println("수정할 제목 입력 :");
						this.boardTitle[k] = scan.next();
						System.out.println("수정할 내용 입력 :");
						this.main[k] = scan.next();

						return check = true;
					}
				}
			}
		}
		return check ;

	}
}
