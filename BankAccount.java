/**
 * Created by namita on 7/6/18.
 */
public class BankAccount {
	private int accountNumber;
	private int balance;
	private String custName;
	private String email;
	private String phoneNumber;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int depositFunds(int depositAmount){
		System.out.println("Please enter the amount you want to deposit");
		balance = (depositAmount + balance);
		System.out.print("Total balance after despsit is" + balance);
		return balance;
	}

	public int withdrawFunds(int withdrawAmount) {
		System.out.println("Please enter the amount you want to withdraw");
		if (withdrawAmount > balance)
		{
			System.out.println("Insufficient funds, please try later");
			return balance;
		} else {
			balance = (balance - withdrawAmount);
			System.out.print("Total balance after withdrawel is" + balance);
			return  balance;
		}
	}
}
