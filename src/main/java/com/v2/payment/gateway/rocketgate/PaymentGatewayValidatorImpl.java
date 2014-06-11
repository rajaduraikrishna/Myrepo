/**
 * 
 */
package com.v2.payment.gateway.rocketgate;

import com.v2.payment.ValidationException;
import com.v2.payment.gateway.PaymentGatewayValidator;
import com.v2.payment.vo.PaymentGatewayRequest;

/**
 * @author rajadurai
 *
 */
public class PaymentGatewayValidatorImpl implements PaymentGatewayValidator {

	private static final Object EMPTY = "";

	/* (non-Javadoc)
	 * @see com.v2.payment.gateway.PaymentGatewayValidator#validateRequest(com.v2.payment.vo.Payment)
	 */
	@Override
	public boolean validateRequest(PaymentGatewayRequest aPayment) throws ValidationException {
		boolean isValid = true;
		if(aPayment != null) {
			if (aPayment.getCardNumber() == null || EMPTY.equals(aPayment.getCardNumber())) {
				throw new ValidationException("100", "Card number is empty");
			}
			if (aPayment.getExpiryMonth() <=0 ) {
				throw new ValidationException("100", "invalid expiry monthy");
			}
			if (aPayment.getExpiryYear() <=0 ) {
				throw new ValidationException("100", "invalid expiry year");
			}
			if (aPayment.getAmount() == null ) {
				throw new ValidationException("100", "Amount Cannot be null");
			}
			if (aPayment.getCurrency() == null ) {
				throw new ValidationException("100", "Currency cannot be null");
			}
		} else {
			throw new ValidationException("100", "Request is null");
		}
		return isValid;
	}

}
