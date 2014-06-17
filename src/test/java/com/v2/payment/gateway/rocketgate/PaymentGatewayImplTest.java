/**
 * 
 */
package com.v2.payment.gateway.rocketgate;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import javax.ws.rs.core.Response;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.powermock.api.easymock.PowerMock;

import com.rocketgate.client.GatewayRequest;
import com.rocketgate.client.GatewayResponse;
import com.rocketgate.client.GatewayService;
import com.v2.payment.vo.PaymentGatewayRequest;
import com.v2.payment.vo.PaymentGatewayResponse;

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
	 * Test method for {@link com.v2.payment.gateway.rocketgate.PaymentGatewayImpl#authCard(com.v2.payment.vo.PaymentGatewayRequest)}.
	 */
	@Test
	public void testAuthCard() {
		GatewayService service = PowerMock.createMock(GatewayService.class);
//		Response response = new Response();
		EasyMock.expect(service.PerformAuthOnly(EasyMock.isA(GatewayRequest.class), EasyMock.isA(GatewayResponse.class))).andReturn(true);
		PaymentGatewayImpl gateway = new PaymentGatewayImpl();
		gateway.setService(service);
		PaymentGatewayRequest payment = new PaymentGatewayRequest();
		payment.setAmount(10.97);
		payment.setCardNumber("5555555555554444");
		payment.setExpiryMonth(8);
		payment.setExpiryYear(2015);
		payment.setCvv2(1234);
		payment.setCustomerFirstName("Raja");
		payment.setCustomerLastName("Durai");
		payment.setCustomerEmail("k.rajadurai@gmail.com");
		payment.setCustomerPhone("9886325224");
		payment.setBillingAddress("123 Main st");
		payment.setBillingCity("Las Vegas");
		payment.setBillingState("Nevada");
		payment.setBillingPostalCode("89141");
		payment.setBillingCountry("US");
//		PowerMock.exp
		PaymentGatewayResponse response = gateway.authCard(payment );
		assertNotNull(response);
		assertNull(response.getTransactionId());
	}

}
