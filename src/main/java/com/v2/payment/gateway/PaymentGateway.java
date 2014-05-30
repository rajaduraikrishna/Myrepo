/**
 * 
 */
package com.v2.payment.gateway;

import com.v2.payment.vo.Payment;
import com.v2.payment.vo.PaymentGatewayResponse;

/**
 * @author Rajadurai Krishnamoorthy
 * @Creaetd May 22, 2014
 * @Class PaymentGateway
 *
 */
public interface PaymentGateway {

	/**
	 * payment gateway method to authorize the card
	 */
	public PaymentGatewayResponse authCard(Payment paymentDetails);
}
