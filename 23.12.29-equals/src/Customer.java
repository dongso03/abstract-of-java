//고객
// 이름
// 전화번호

public class Customer {

	private String name;
	private String phoneNumber;

	public Customer(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public boolean equals(Object obj) {
		Customer c = (Customer) obj;
		if (this.getName().equals(c.getName()) && this.getPhoneNumber().equals(c.getPhoneNumber())) {
			return true;
		} else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
