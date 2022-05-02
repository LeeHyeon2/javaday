package Bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankService bs = new BankService();
		do {
			System.out.println("-------------------------------------");
			System.out.println("1.신규 고객 등록 || 2.은행 업무 || 3.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택>");
			int choice = scan.nextInt();

			if (choice == 1) {
				bs.save();
			} else if (choice == 2) {
				System.out.println("-----------------------------------------");
				System.out.println("1.잔액조회 || 2.입금 || 3.출금 || 4.거래내역확인");
				System.out.println("-----------------------------------------");
				System.out.print("선택>");
				int choice2 = scan.nextInt();
				if (choice2 == 1) {
					bs.findAc();
				} else if (choice2 == 2) {
					bs.deposit();
				} else if (choice2 == 3) {
					bs.withdraw();
				} else if (choice2 == 4) {
					bs.findAll();
				} else {
					System.out.println("올바른 숫자를 입력 해 주세요");
				}
			} else if (choice == 3) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("올바른 숫자를 입력 해 주세요");
			}
		} while (true);
	}

}
