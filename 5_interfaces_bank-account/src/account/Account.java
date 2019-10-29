package account;

public abstract class Account {

	private Double balance = 0.0;

	public void deposit(Double amount) {
		balance += amount;
	}

	public abstract Double getValue();

	public void print() {
		System.out.println(getValue());
	}
}
