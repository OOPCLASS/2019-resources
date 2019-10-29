package account;

public class SavingsAccount extends Account implements BankItem {

	private Double interestRate = 0.1;

	@Override
	public void deposit(Double amount) {
		super.deposit(amount * interestRate);
	}

	public Double getValue() {
		return 10.0;
	}

	public void save() {

	}

	public Long getId() {
		return null;
	}
}
