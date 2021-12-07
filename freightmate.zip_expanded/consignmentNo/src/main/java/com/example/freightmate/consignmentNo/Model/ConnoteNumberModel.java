/* Added getters and setters for all the input variables */
package com.example.freightmate.consignmentNo.Model;

import org.springframework.stereotype.Component;

@Component

public class ConnoteNumberModel {
	private String carrierName;
	private String accountNumber;
	private int digits;
	private int lastUsedIndex;
	private int rangeStart;
	private int rangeEnd;
	
	
	public ConnoteNumberModel() {
		super();
	}

	public ConnoteNumberModel(String carrierName, String accountNumber, int digits, int lastUsedIndex, int rangeStart,
			int rangeEnd) {
		super();
		this.carrierName = carrierName;
		this.accountNumber = accountNumber;
		this.digits = digits;
		this.lastUsedIndex = lastUsedIndex;
		this.rangeStart = rangeStart;
		this.rangeEnd = rangeEnd;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setDigits(int digits) {
		this.digits = digits;
	}

	public void setLastUsedIndex(int lastUsedIndex) {
		this.lastUsedIndex = lastUsedIndex;
	}

	public void setRangeStart(int rangeStart) {
		this.rangeStart = rangeStart;
	}

	public void setRangeEnd(int rangeEnd) {
		this.rangeEnd = rangeEnd;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getDigits() {
		return digits;
	}

	public int getLastUsedIndex() {
		return lastUsedIndex;
	}

	public int getRangeStart() {
		return rangeStart;
	}

	public int getRangeEnd() {
		return rangeEnd;
	}

}
