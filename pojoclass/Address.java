package pojoclass;

public class Address {
	private String B_No;
	private String street;
	private String state;
	private String pincode;
	public Address(String b_No, String street, String state, String pincode) {
		super();
		B_No = b_No;
		this.street = street;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [B_No=" + B_No + ", street=" + street + ", state=" + state + ", pincode=" + pincode + "]";
	}
	public String getB_No() {
		return B_No;
	}
	public void setB_No(String b_No) {
		B_No = b_No;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
