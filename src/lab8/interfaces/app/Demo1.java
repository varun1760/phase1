package lab8.interfaces.app;

abstract class BankAbstract{
	abstract void noFunction();
}

interface IbmBankAccount{
	void deposite();
	void withdraw();
	void balance();
}

interface IbmBank{
	void openAccount();
	void closeAccount();
}

class SavingAccount extends BankAbstract
implements IbmBankAccount , IbmBank {

	@Override
	public void deposite() {
		System.out.println("Deposite in Saving Account");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw in Saving Account");
	}

	@Override
	public void balance() {
		System.out.println("Balance in Saving Account");
	}

	@Override
	public void openAccount() {
		System.out.println("Open Saving Account");
	}

	@Override
	public void closeAccount() {
		System.out.println("Close Saving Account");
	}

	@Override
	void noFunction() {
		System.out.println("Warning: Useless line spotted below");
	}
}

class CurrentAccount implements IbmBankAccount , IbmBank {

	@Override
	public void deposite() {
		System.out.println("Deposite in Current Account");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw in Current Account");
	}

	@Override
	public void balance() {
		System.out.println("Balance in Current Account");
	}
	
	@Override
	public void openAccount() {
		System.out.println("Open Current Account");
	}

	@Override
	public void closeAccount() {
		System.out.println("Close Current Account");
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		SavingAccount saving = new SavingAccount();
		saving.deposite();
		saving.withdraw();
		saving.balance();
		saving.openAccount();
		saving.closeAccount();
		saving.noFunction();
		System.out.println("----------------------");
		
		CurrentAccount current = new CurrentAccount();
		current.deposite();
		current.withdraw();
		current.balance();
		current.openAccount();
		current.closeAccount();
	}

}
