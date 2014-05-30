/**
 * 
 */
package com.v2.payment.gateway.rocketgate;

import org.junit.Before;
import org.junit.Test;

import com.rocketgate.client.GatewayService;
import com.v2.payment.gateway.PaymentGateway;
import com.v2.payment.vo.Payment;

/**
 * @author rajadurai
 *
 */
public class PaymentGatewayImplTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.v2.payment.gateway.rocketgate.PaymentGatewayImpl#authCard(com.v2.payment.vo.Payment)}.
	 */
	@Test
	public void testAuthCard() {
		GatewayService service = Easymock.createMock(GatewayService.class);
		PaymentGatewayImpl gateway = new PaymentGatewayImpl();
		gateway.setService(service);
		Payment aPayment = new Payment();
		gateway.authCard(aPayment );
	}

}
