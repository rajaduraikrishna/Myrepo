/**
 * 
 */
package com.v2.payment.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.v2.payment.gateway.PaymentGateway;
import com.v2.payment.vo.Payment;
import com.v2.payment.vo.PaymentGatewayResponse;

/**
 * @author Rajadurai Krishnamoorthy
 * @Creaetd May 27, 2014
 * @Class PaymentService
 *
 */
@Component
@Path("/payment")
public class PaymentService {

	@Autowired
	PaymentGateway paymentGateway;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/auth")
	public Response authOnly(Payment paymentDetails) {
		System.out.println("Auth method start....");
		PaymentGatewayResponse response = paymentGateway.authCard(paymentDetails );
		return Response.status(200).entity(response).build();
	}
}
