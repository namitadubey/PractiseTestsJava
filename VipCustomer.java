/**
 * Created by namita on 7/7/18.
 */
public class VipCustomer {
	private String name;
	private int creditLimit;
	private String emailAddress;

	public VipCustomer() {
	this("Namita", 123456, "nam@email.com");
	}

	public VipCustomer(String name, String emailAddress) {
		this(name, 785672, emailAddress);
	}

	public VipCustomer (String name, int creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
}
