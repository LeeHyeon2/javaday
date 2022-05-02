package Bank;

public class BankingDTO {
	Long id;
	String accountNumber;
	Long deposit;
	Long withdraw;
	String bankingDate;

	public BankingDTO(Long id, String accountNumber, Long deposit, Long withdraw, String bankingDate) {
		this.id = id;
		this.accountNumber = accountNumber;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.bankingDate = bankingDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getDeposit() {
		return deposit;
	}

	public void setDeposit(Long deposit) {
		this.deposit = deposit;
	}

	public Long getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(Long withdraw) {
		this.withdraw = withdraw;
	}

	public String getBankingDate() {
		return bankingDate;
	}

	public void setBankingDate(String bankingDate) {
		this.bankingDate = bankingDate;
	}

	@Override
	public String toString() {
		return "BankingDTO [id=" + id + ", accountNumber=" + accountNumber + ", deposit=" + deposit + ", withdraw="
				+ withdraw + ", bankingDate=" + bankingDate + "]";
	}

}
