/**
 * Created by namita on 7/6/18.
 */
public class Constructor {
	public static void main (String[] args){
/*		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountNumber(1234);
		bankAccount.setBalance(7000);
		bankAccount.setCustName("Namita");
		bankAccount.setEmail("nams8dewas@gmail.com");
		bankAccount.setPhoneNumber("9860115995");

		bankAccount.depositFunds(1000);
		bankAccount.withdrawFunds(1000);
		bankAccount.withdrawFunds(8000);*/

		VipCustomer nam = new VipCustomer("Nirvaan", 2222222,"neer@email.com");
		System.out.println("VipCustomer is " + nam.getName() + "Customer Limit is " + nam.getCreditLimit() + "Customer email add is " + nam.getEmailAddress());
	}
}
