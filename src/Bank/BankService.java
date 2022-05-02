package Bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BankService {
	Scanner scan = new Scanner(System.in);
	BankRepository br = new BankRepository();
	Long id = 0l;
	Long Bid = 0l;
	

	public void save() {
		LocalDateTime dateTime = LocalDateTime.now();
		String time = dateTime.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss"));
		System.out.print("이름을 입력 해 주세요 : ");
		String clientName = scan.next();
		System.out.print("가입하실 비밀번호를 입력 해 주세요 : ");
		String clientPass = scan.next();
		System.out.print("가입하실 계좌번호를 입력 해 주세요 (6자) : ");
		String accountNumber = scan.next();
		Long balance = 0l;

		Boolean checkAcNum = br.checkAcNum(accountNumber);

		if (checkAcNum) {
			ClientDTO cd = new ClientDTO(++id, clientName, clientPass, time, balance, accountNumber);
			Boolean result = br.save(cd);
			if (result) {
				System.out.println("가입이 완료 됐습니다.");
			} else {
				System.out.println("가입에 실패 했습니다.");
			}
		} else {
			System.out.println("중복된 계좌번호 입니다.");
		}

	}

	public void findAc() {
		System.out.print("조회하실 계좌번호를 입력 해 주세요 : ");
		String acNum = scan.next();
		Boolean check = br.findAc(acNum);
		if (!check) {
			System.out.println("존재하지 않는 계좌번호 입니다.");
		}

	}

	public void deposit() {
		LocalDateTime dateTime = LocalDateTime.now();
		String time = dateTime.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss"));
		System.out.print("입금할 계좌번호 입력 : ");
		String checkAcNum = scan.next();
		Boolean check = br.checkAcNum(checkAcNum);
		if (!check) {
			System.out.print("입금하실 금액 입력 : ");
			Long deposit1 = scan.nextLong();
			if (deposit1 > 0) {
				BankingDTO bd = new BankingDTO(++Bid, checkAcNum, deposit1, 0l, time);
				br.deposit(bd);
				System.out.println("입금이 완료 됐습니다.");
			} else {
				System.out.println("0보다 큰 숫자만 입력 가능합니다.");
			}

		} else {
			System.out.println("해당 계좌와 일치하는 계좌가 없습니다.");
		}

	}

	public void withdraw() {
		LocalDateTime dateTime = LocalDateTime.now();
		String time = dateTime.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss"));
		System.out.print("출금할 계좌번호 입력 : ");
		String checkAcNum = scan.next();
		System.out.print("계좌번호의 비밀번호 입력 : ");
		String pass = scan.next();
		Boolean login = br.login(checkAcNum, pass);
		if (login) {
			System.out.print("출금하실 금액 입력 : ");
			Long min = scan.nextLong();
			if (min > 0) {
				Boolean balance = br.balance(min, checkAcNum);
				if (balance) {
					BankingDTO bd = new BankingDTO(++Bid, checkAcNum, 0l, min, time);
					br.withdraw(bd);
					System.out.println("출금이 완료 됐습니다.");
				} else {
					System.out.println("잔액이 부족합니다.");
				}
			} else {
				System.out.println("일치하지 않는 계좌번호 혹은 비밀번호 입니다.");
			}
		} else {
			System.out.println("0보다 큰 숫자만 입력 가능합니다.");
		}

	}

	void findAll() {
		System.out.print("조회하실 계좌번호를 입력해 주세요 : ");
		String checkAcNum = scan.next();
		Boolean checkAcNum1 = br.checkAcNum(checkAcNum);
		if (!checkAcNum1) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.모든 거래내역 확인 || 2.입금 내역만 확인 || 3.출금 내역만 확인");
			System.out.println("-------------------------------------------------------");
			int choice3 = scan.nextInt();
			if (choice3 == 1) {
				br.findAll(checkAcNum);
			} else if (choice3 == 2) {
				br.finddeposit(checkAcNum);
			} else if (choice3 == 3) {
				br.findwithdraw(checkAcNum);
			} else {
				System.out.println("올바른 숫자를 입력 해 주세요.");
			}
		} else {
			System.out.println("존재하지 않는 계좌번호 입니다.");
		}

	}

}
