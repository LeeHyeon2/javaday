package Bank;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {
	static List<ClientDTO> cList = new ArrayList<>();
	static List<BankingDTO> bList = new ArrayList<>();

	public Boolean checkAcNum(String accountNumber) {
		Boolean check = true;
		for (int i = 0; i < cList.size(); i++) {
			if (accountNumber.equals(cList.get(i).getAccountNumber())) {
				check = false;
			}
		}
		return check;
	}

	Boolean save(ClientDTO cd) {
		Boolean result = cList.add(cd);
		return result;
	}

	Boolean findAc(String acNum) {
		Boolean check = false;
		for (int i = 0; i < cList.size(); i++) {
			if (acNum.equals(cList.get(i).getAccountNumber())) {
				check = true;
				System.out.println("현재 잔액은 : " + cList.get(i).getBalance() + "원 입니다.");
			}
		}
		return check;

	}

	public void deposit(BankingDTO bd) {
		bList.add(bd);
		for (int i = 0; i < cList.size(); i++) {
			if (bList.get(bList.size() - 1).getAccountNumber().equals(cList.get(i).getAccountNumber())) {
				cList.get(i).setBalance(cList.get(i).getBalance() + bList.get(bList.size() - 1).getDeposit());
			}
		}

	}

	public Boolean login(String acNum, String pass) {
		Boolean check = false;
		for (int i = 0; i < cList.size(); i++) {
			if (acNum.equals(cList.get(i).getAccountNumber()) && pass.equals(cList.get(i).getClientPass())) {
				check = true;
			}
		}
		return check;
	}

	Boolean balance(Long min, String checkAcNum) {
		Boolean check = false;
		for (int i = 0; i < cList.size(); i++) {
			if (checkAcNum.equals(cList.get(i).getAccountNumber()) && min <= cList.get(i).getBalance()) {
				check = true;
			}
		}
		return check;
	}

	void withdraw(BankingDTO bd) {
		bList.add(bd);
		for (int i = 0; i < cList.size(); i++) {
			if (bList.get(bList.size() - 1).getAccountNumber().equals(cList.get(i).getAccountNumber())) {
				cList.get(i).setBalance(cList.get(i).getBalance() - bList.get(bList.size() - 1).getWithdraw());
			}
		}

	}

	void findAll(String checkAcNum) {
		for (int i = 0; i < bList.size(); i++) {
			if (checkAcNum.equals(bList.get(i).getAccountNumber())) {
				if (bList.get(i).getDeposit() > 0) {
					System.out.println("거래내역 관리번호 : " + bList.get(i).getId() + " , 계좌번호 : "
							+ bList.get(i).getAccountNumber() + " , 입금액 : " + bList.get(i).getDeposit() + " , 거래일자 : "
							+ bList.get(i).getBankingDate());
				} else {
					System.out.println("거래내역 관리번호 : " + bList.get(i).getId() + " , 계좌번호 : "
							+ bList.get(i).getAccountNumber() + " , 출금액 : " + bList.get(i).getWithdraw() + " , 거래일자 : "
							+ bList.get(i).getBankingDate());
				}
			}
		}

	}

	public void finddeposit(String checkAcNum) {
		for (int i = 0; i < bList.size(); i++) {
			if (checkAcNum.equals(bList.get(i).getAccountNumber())) {
				if (bList.get(i).getDeposit() > 0) {
					System.out.println("거래내역 관리번호 : " + bList.get(i).getId() + " , 계좌번호 : "
							+ bList.get(i).getAccountNumber() + " , 입금액 : " + bList.get(i).getDeposit() + " , 거래일자 : "
							+ bList.get(i).getBankingDate());
				}
			}
		}

	}

	public void findwithdraw(String checkAcNum) {
		for (int i = 0; i < bList.size(); i++) {
			if (checkAcNum.equals(bList.get(i).getAccountNumber())) {
				if (bList.get(i).getWithdraw() > 0) {
					System.out.println("거래내역 관리번호 : " + bList.get(i).getId() + " , 계좌번호 : "
							+ bList.get(i).getAccountNumber() + " , 출금액 : " + bList.get(i).getWithdraw() + " , 거래일자 : "
							+ bList.get(i).getBankingDate());

				}
			}
		}

	}

}
