/**
 * 
 */
package com.v2.payment;

/**
 * @author rajadurai
 *
 */
@SuppressWarnings({ "serial", "unused" })
public class ValidationException extends Exception {

	private String errorCode;
	private String errorMsg;
	public ValidationException(String aErrorCode, String aErrorMsg) {
		setErrorCode(aErrorCode);
		setErrorMsg(aErrorMsg);
	}
	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	/**
	 * @param errorMsg the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
