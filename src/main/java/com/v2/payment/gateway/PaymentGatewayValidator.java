/**
 * 
 */
package com.v2.payment.gateway;

import com.v2.payment.ValidationException;
import com.v2.payment.vo.Payment;

/**
 * @author rajadurai
 *
 */
public interface PaymentGatewayValidator {

	/**
	 * @param aPayment
	 * @return boolean 
	 * @throws validation Error in case of any validation issues
	 */
	public boolean validateRequest(Payment aPayment) throws ValidationException;
}
