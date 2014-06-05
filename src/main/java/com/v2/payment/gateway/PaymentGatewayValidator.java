/**
 * 
 */
package com.v2.payment.gateway;

import com.v2.payment.ValidationException;
import com.v2.payment.vo.PaymentGatewayRequest;

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
	public boolean validateRequest(PaymentGatewayRequest aPayment) throws ValidationException;
}
