package filehandling;

import java.io.Serializable;

public class Account implements Serializable{
	private int accNo;
	private String accName;
	private transient int accAtmPin;
	
	public Account(int accNo, String accName, int accAtmPin) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accAtmPin = accAtmPin;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public int getAccAtmPin() {
		return accAtmPin;
	}

	public void setAccAtmPin(int accAtmPin) {
		this.accAtmPin = accAtmPin;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", accAtmPin=" + accAtmPin + "]";
	}
}
