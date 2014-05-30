/**
 * 
 */
package com.v2.payment.vo;

/**
 * @author rajadurai
 *
 */
public class PaymentGatewayResponse {

	private String responseCode;
	private String reasonCode;
	private String transactionId;
	private String authNo;
	private String avsResponse;
	private String cvv2;
	private String exception;
	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}
	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	/**
	 * @return the reasonCode
	 */
	public String getReasonCode() {
		return reasonCode;
	}
	/**
	 * @param reasonCode the reasonCode to set
	 */
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	/**
	 * @return the authNo
	 */
	public String getAuthNo() {
		return authNo;
	}
	/**
	 * @param authNo the authNo to set
	 */
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}
	/**
	 * @return the avsResponse
	 */
	public String getAvsResponse() {
		return avsResponse;
	}
	/**
	 * @param avsResponse the avsResponse to set
	 */
	public void setAvsResponse(String avsResponse) {
		this.avsResponse = avsResponse;
	}
	/**
	 * @return the cvv2
	 */
	public String getCvv2() {
		return cvv2;
	}
	/**
	 * @param cvv2 the cvv2 to set
	 */
	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}
	/**
	 * @return the exception
	 */
	public String getException() {
		return exception;
	}
	/**
	 * @param exception the exception to set
	 */
	public void setException(String exception) {
		this.exception = exception;
	}
}
