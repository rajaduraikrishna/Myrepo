/**
 * 
 */
package com.v2.payment.rocketgate;

import com.v2.payment.gateway.rocketgate.PaymentGatewayImpl;
import com.v2.payment.vo.PaymentGatewayRequest;

/**
 * @author Rajasundar
 *
 */
public class rocketGateTest {
	  public static void main(String [] args) {
		    
		//
//			Fill in the fields of the gateway request.
		//
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
		 PaymentGatewayImpl paymentGateway = new PaymentGatewayImpl();
		 System.out.println("Result  : " + paymentGateway.authCard(payment));
		  
	  }

}
