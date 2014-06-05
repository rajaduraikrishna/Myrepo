/**
 * 
 */
package com.v2.payment.vo;

/**
 * @author Rajadurai Krishnamoorthy
 * @Creaetd May 22, 2014
 * @Class PaymentGatewayRequest
 *
 */
public class PaymentGatewayRequest {
	private String cardNumber;
	private int expiryMonth;
	private int expiryYear;
	private int cvv2;
	private Double amount;
	private String customerFirstName;
	private String customerLastName;
	private String customerEmail;
	private String customerPhone;
	private String billingAddress;
	private String billingCity;
	private String billingState;
	private String billingCountry;
	private String billingPostalCode;
	private String currency;
	private boolean testMode;
	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}
	/**
	 * @param aCardNumber the cardNumber to set
	 */
	public void setCardNumber(String aCardNumber) {
		cardNumber = aCardNumber;
	}
	/**
	 * @return the expiryMonth
	 */
	public int getExpiryMonth() {
		return expiryMonth;
	}
	/**
	 * @param aExpiryMonth the expiryMonth to set
	 */
	public void setExpiryMonth(int aExpiryMonth) {
		expiryMonth = aExpiryMonth;
	}
	/**
	 * @return the expiryYear
	 */
	public int getExpiryYear() {
		return expiryYear;
	}
	/**
	 * @param aExpiryYear the expiryYear to set
	 */
	public void setExpiryYear(int aExpiryYear) {
		expiryYear = aExpiryYear;
	}
	/**
	 * @return the cvv2
	 */
	public int getCvv2() {
		return cvv2;
	}
	/**
	 * @param aCvv2 the cvv2 to set
	 */
	public void setCvv2(int aCvv2) {
		cvv2 = aCvv2;
	}
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}
	/**
	 * @param aAmount the amount to set
	 */
	public void setAmount(Double aAmount) {
		amount = aAmount;
	}
	/**
	 * @return the customerFirstName
	 */
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	/**
	 * @param aCustomerFirstName the customerFirstName to set
	 */
	public void setCustomerFirstName(String aCustomerFirstName) {
		customerFirstName = aCustomerFirstName;
	}
	/**
	 * @return the customerLastName
	 */
	public String getCustomerLastName() {
		return customerLastName;
	}
	/**
	 * @param aCustomerLastName the customerLastName to set
	 */
	public void setCustomerLastName(String aCustomerLastName) {
		customerLastName = aCustomerLastName;
	}
	/**
	 * @return the customerEmail
	 */
	public String getCustomerEmail() {
		return customerEmail;
	}
	/**
	 * @param aCustomerEmail the customerEmail to set
	 */
	public void setCustomerEmail(String aCustomerEmail) {
		customerEmail = aCustomerEmail;
	}
	/**
	 * @return the customerPhone
	 */
	public String getCustomerPhone() {
		return customerPhone;
	}
	/**
	 * @param aCustomerPhone the customerPhone to set
	 */
	public void setCustomerPhone(String aCustomerPhone) {
		customerPhone = aCustomerPhone;
	}
	/**
	 * @return the billingAddress
	 */
	public String getBillingAddress() {
		return billingAddress;
	}
	/**
	 * @param aBillingAddress the billingAddress to set
	 */
	public void setBillingAddress(String aBillingAddress) {
		billingAddress = aBillingAddress;
	}
	/**
	 * @return the billingCity
	 */
	public String getBillingCity() {
		return billingCity;
	}
	/**
	 * @param aBillingCity the billingCity to set
	 */
	public void setBillingCity(String aBillingCity) {
		billingCity = aBillingCity;
	}
	/**
	 * @return the billingState
	 */
	public String getBillingState() {
		return billingState;
	}
	/**
	 * @param aBillingState the billingState to set
	 */
	public void setBillingState(String aBillingState) {
		billingState = aBillingState;
	}
	/**
	 * @return the billingCountry
	 */
	public String getBillingCountry() {
		return billingCountry;
	}
	/**
	 * @param aBillingCountry the billingCountry to set
	 */
	public void setBillingCountry(String aBillingCountry) {
		billingCountry = aBillingCountry;
	}
	/**
	 * @return the billingPostalCode
	 */
	public String getBillingPostalCode() {
		return billingPostalCode;
	}
	/**
	 * @param aBillingPostalCode the billingPostalCode to set
	 */
	public void setBillingPostalCode(String aBillingPostalCode) {
		billingPostalCode = aBillingPostalCode;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the testMode
	 */
	public boolean isTestMode() {
		return testMode;
	}
	/**
	 * @param testMode the testMode to set
	 */
	public void setTestMode(boolean testMode) {
		this.testMode = testMode;
	}

	
}
