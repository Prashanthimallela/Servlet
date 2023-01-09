package com.test1.jsf.bean;

public class Bill1 {
	private int meterID;
	private String consumerName;
	private int currMeterReading;
	private int prevMeterReading;
	private int amount;
	private String zone;
	public Bill1(int meterID, String consumerName, int currMeterReading, int prevMeterReading, int amount,
			String zone) {
		super();
		this.meterID = meterID;
		this.consumerName = consumerName;
		this.currMeterReading = currMeterReading;
		this.prevMeterReading = prevMeterReading;
		this.amount = amount;
		this.zone = zone;
	}
	public int getMeterID() {
		return meterID;
	}
	public void setMeterID(int meterID) {
		this.meterID = meterID;
	}
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	public int getCurrMeterReading() {
		return currMeterReading;
	}
	public void setCurrMeterReading(int currMeterReading) {
		this.currMeterReading = currMeterReading;
	}
	public int getPrevMeterReading() {
		return prevMeterReading;
	}
	public void setPrevMeterReading(int prevMeterReading) {
		this.prevMeterReading = prevMeterReading;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	 
}
