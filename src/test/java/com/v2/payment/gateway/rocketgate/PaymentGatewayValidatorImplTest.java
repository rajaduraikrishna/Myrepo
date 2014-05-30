/**
 * 
 */
package com.v2.payment.gateway.rocketgate;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.v2.payment.ValidationException;
import com.v2.payment.gateway.PaymentGatewayValidator;
import com.v2.payment.vo.Payment;

/**
 * @author rajadurai
 *
 */
public class PaymentGatewayValidatorImplTest {

	PaymentGatewayValidator validator;
	Payment aPayment;
	/**
	 * setup method
	 */
	@Before public void setup() {
		validator = new PaymentGatewayValidatorImpl();
		aPayment = new Payment();
	}
	/**
	 * Test method for {@link com.v2.payment.gateway.rocketgate.PaymentGatewayValidatorImpl#validateRequest(com.v2.payment.vo.Payment)}.
	 */
	@Test
	public void testValidateRequest() {
		aPayment.setCardNumber("1111111111111111");
		aPayment.setExpiryMonth(8);
		aPayment.setExpiryYear(2015);
		aPayment.setAmount(new Double(10.45));
		aPayment.setCurrency("USD");
		boolean isValid = false;
		try {
			isValid = validator.validateRequest(aPayment);
		} catch (Exception e) {
			fail("Test failed due to valdation Errors");
			e.printStackTrace();
		}
		assertTrue(isValid);
	}

	/**
	 * Test method for {@link com.v2.payment.gateway.rocketgate.PaymentGatewayValidatorImpl#validateRequest(com.v2.payment.vo.Payment)}.
	 * @throws Exception 
	 */
	@Test
	(expected=ValidationException.class)
	public void testValidateRequestForEmptyCardNumber() throws Exception {
		aPayment.setCardNumber("");;
		validator.validateRequest(aPayment);
	}

	/**
	 * Test method for {@link com.v2.payment.gateway.rocketgate.PaymentGatewayValidatorImpl#validateRequest(com.v2.payment.vo.Payment)}.
	 * @throws Exception 
	 */
	@Test
	(expected=ValidationException.class)
	public void testValidateRequestNullCardNumber() throws Exception {
		validator.validateRequest(aPayment);
	}

	/**
	 * Test method for {@link com.v2.payment.gateway.rocketgate.PaymentGatewayValidatorImpl#validateRequest(com.v2.payment.vo.Payment)}.
	 * @throws Exception 
	 */
	@Test
	(expected=ValidationException.class)
	public void testValidateRequestnulliExpriyMonth() throws Exception {
		aPayment.setCardNumber("1111222233334444");
		aPayment.setExpiryYear(2015);
		aPayment.setAmount(new Double(10.34));
		aPayment.setCurrency("GBP");
		validator.validateRequest(aPayment);
	}
	/**
	 * Test method for {@link com.v2.payment.gateway.rocketgate.PaymentGatewayValidatorImpl#validateRequest(com.v2.payment.vo.Payment)}.
	 * @throws Exception 
	 */
	@Test
	(expected=ValidationException.class)
	public void testValidateRequestInvaliExpriyMonth() throws Exception {
		aPayment.setCardNumber("1111222233334444");
		aPayment.setExpiryMonth(-2);
		aPayment.setExpiryYear(2015);
		aPayment.setAmount(new Double(10.34));
		aPayment.setCurrency("GBP");
		validator.validateRequest(aPayment);
	}
	/**
	 * Test method for {@link com.v2.payment.gateway.rocketgate.PaymentGatewayValidatorImpl#validateRequest(com.v2.payment.vo.Payment)}.
	 * @throws Exception 
	 */
	@Test
	(expected=ValidationException.class)
	public void testValidateRequestnulliExpriyYear() throws Exception {
		aPayment.setCardNumber("1111222233334444");
		aPayment.setExpiryMonth(2);
		aPayment.setAmount(new Double(10.34));
		aPayment.setCurrency("GBP");
		validator.validateRequest(aPayment);
	}
	/**
	 * Test method for {@link com.v2.payment.gateway.rocketgate.PaymentGatewayValidatorImpl#validateRequest(com.v2.payment.vo.Payment)}.
	 * @throws Exception 
	 */
	@Test
	(expected=ValidationException.class)
	public void testValidateRequestInvaliExpriyYear() throws Exception {
		aPayment.setCardNumber("1111222233334444");
		aPayment.setExpiryMonth(2);
		aPayment.setExpiryYear(-2015);
		aPayment.setAmount(new Double(10.34));
		aPayment.setCurrency("GBP");
		validator.validateRequest(aPayment);
	}
	/**
	 * Test method for {@link com.v2.payment.gateway.rocketgate.PaymentGatewayValidatorImpl#validateRequest(com.v2.payment.vo.Payment)}.
	 * @throws Exception 
	 */
	@Test
	(expected=ValidationException.class)
	public void testValidateRequestNullAmount() throws Exception {
		aPayment.setCardNumber("1111222233334444");
		aPayment.setExpiryMonth(2);
		aPayment.setExpiryYear(2015);
		aPayment.setCurrency("GBP");
		validator.validateRequest(aPayment);
	}

	/**
	 * Test method for {@link com.v2.payment.gateway.rocketgate.PaymentGatewayValidatorImpl#validateRequest(com.v2.payment.vo.Payment)}.
	 * @throws Exception 
	 */
	@Test
	(expected=ValidationException.class)
	public void testValidateRequestNullCurrency() throws Exception {
		aPayment.setCardNumber("1111222233334444");
		aPayment.setExpiryMonth(2);
		aPayment.setExpiryYear(2015);
		aPayment.setAmount(new Double(10.34));
		validator.validateRequest(aPayment);
	}
}
