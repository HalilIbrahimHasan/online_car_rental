package customers;

import payment_info.*;

public class User {

	private String name;
	private String lastName;
	private int age;
	private int customerId;
	private boolean existingUser;
	private Address address;
	private CreditCardInfo creditCardInfo;
	private DebitCardInfo debitCardInfo;

	
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public CreditCardInfo getCreditCardInfo() {
		return creditCardInfo;
	}

	public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}

	public DebitCardInfo getDebitCardInfo() {
		return debitCardInfo;
	}

	public void setDebitCardInfo(DebitCardInfo debitCardInfo) {
		this.debitCardInfo = debitCardInfo;
	}

	public boolean isExistingUser() {
		return existingUser;
	}

	public void setExistingUser(boolean existingUser) {
		this.existingUser = existingUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
