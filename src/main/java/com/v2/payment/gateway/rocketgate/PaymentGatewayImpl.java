/**
 * 
 */
package com.v2.payment.gateway.rocketgate;

import com.rocketgate.client.GatewayRequest;
import com.rocketgate.client.GatewayResponse;
import com.rocketgate.client.GatewayService;
import com.v2.payment.gateway.PaymentGateway;
import com.v2.payment.vo.PaymentGatewayRequest;
import com.v2.payment.vo.PaymentGatewayResponse;

/**
 * @author Rajadurai Krishnamoorthy
 * @Creaetd May 22, 2014
 * @Class PaymentGatewayImpl
 *
 */
public class PaymentGatewayImpl implements PaymentGateway {

	private GatewayService service;
	
	/* (non-Javadoc)
	 * @see com.v2.payment.gateway.PaymentGateway#authCard(com.v2.payment.vo.Payment)
	 */
	public PaymentGatewayResponse authCard(PaymentGatewayRequest aPaymentGatewayRequest) {

		PaymentGatewayResponse gatewayResponse = new PaymentGatewayResponse();

	    GatewayResponse response = new GatewayResponse();	// Empty response

	    GatewayRequest request = createRequest(aPaymentGatewayRequest);
	    getService().SetTestMode(aPaymentGatewayRequest.isTestMode());

	    if (getService().PerformAuthOnly(request, response)) {
	    	createSuccessResponse(gatewayResponse, response);
	    } else {
	    	createErrorResponse(gatewayResponse, response);
	    }
	  
		return gatewayResponse;
	}

	@Override
	public PaymentGatewayResponse purchase(PaymentGatewayRequest aPaymentGatewayRequest) {
		PaymentGatewayResponse gatewayResponse = new PaymentGatewayResponse();
	    
	    GatewayResponse response = new GatewayResponse();	// Empty response

	    GatewayRequest request = createRequest(aPaymentGatewayRequest);

	    getService().SetTestMode(aPaymentGatewayRequest.isTestMode());

	    if (getService().PerformPurchase(request, response)) {
	    	createSuccessResponse(gatewayResponse, response);
	    	
	      System.out.println("Transaction succeeded");
	      System.out.println("Response Code: "
				 + response.Get(GatewayResponse.RESPONSE_CODE));
	      System.out.println("Reason Code: "
				 + response.Get(GatewayResponse.REASON_CODE));
	      System.out.println("Auth No: "
				 + response.Get(GatewayResponse.AUTH_NO));
	      System.out.println("AVS: " + response.Get(GatewayResponse.AVS_RESPONSE));
	      System.out.println("CVV2: " + response.Get(GatewayResponse.CVV2_CODE));
	      System.out.println("GUID: " + response.Get(GatewayResponse.TRANSACT_ID));
	      System.out.println("Account: " + response.Get(GatewayResponse.MERCHANT_ACCOUNT));
	    } else {

	    	createErrorResponse(gatewayResponse, response);
	      System.out.println("Transaction failed");
	      System.out.println("Response Code: "
				 + response.Get(GatewayResponse.RESPONSE_CODE));
	      System.out.println("Reason Code: "
				 + response.Get(GatewayResponse.REASON_CODE));
	      System.out.println("Exception: "
				 + response.Get(GatewayResponse.EXCEPTION));
	    }
	  
		return gatewayResponse;
	}
	
	/**
	 * @param gatewayResponse
	 * @param response
	 */
	private void createErrorResponse(PaymentGatewayResponse gatewayResponse,
			GatewayResponse response) {
		gatewayResponse.setReasonCode(response.Get(GatewayResponse.REASON_CODE));
		gatewayResponse.setResponseCode(response.Get(GatewayResponse.RESPONSE_CODE));
		gatewayResponse.setException(response.Get(GatewayResponse.EXCEPTION));
	}

	/**
	 * @param gatewayResponse
	 * @param response
	 */
	private void createSuccessResponse(PaymentGatewayResponse gatewayResponse,
			GatewayResponse response) {
		gatewayResponse.setReasonCode(response.Get(GatewayResponse.REASON_CODE));
		gatewayResponse.setResponseCode(response.Get(GatewayResponse.RESPONSE_CODE));
		gatewayResponse.setAuthNo(response.Get(GatewayResponse.AUTH_NO));
		gatewayResponse.setTransactionId(response.Get(GatewayResponse.TRANSACT_ID));
		gatewayResponse.setAvsResponse(response.Get(GatewayResponse.AVS_RESPONSE));
		gatewayResponse.setCvv2(response.Get(GatewayResponse.CVV2_CODE));
	}

	/**
	 * @return the service
	 */
	public GatewayService getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(GatewayService service) {
		this.service = service;
	}


	private GatewayRequest createRequest(PaymentGatewayRequest aPaymentDetails) {
		GatewayRequest request = new GatewayRequest();		// Empty request
	    // To read fromc configuration
	    request.Set(GatewayRequest.MERCHANT_ID, "1");
	    request.Set(GatewayRequest.MERCHANT_PASSWORD, "testpassword");

	    request.Set(GatewayRequest.CARDNO, aPaymentDetails.getCardNumber());
	    request.Set(GatewayRequest.EXPIRE_MONTH, aPaymentDetails.getExpiryMonth());
	    request.Set(GatewayRequest.EXPIRE_YEAR, aPaymentDetails.getExpiryYear());
	    request.Set(GatewayRequest.CVV2, aPaymentDetails.getCvv2());

	    request.Set(GatewayRequest.AMOUNT, aPaymentDetails.getAmount());


	    request.Set(GatewayRequest.CUSTOMER_FIRSTNAME, aPaymentDetails.getCustomerFirstName());
	    request.Set(GatewayRequest.CUSTOMER_LASTNAME, aPaymentDetails.getCustomerLastName());
	    request.Set(GatewayRequest.CUSTOMER_PHONE_NO, aPaymentDetails.getCustomerPhone());
	    request.Set(GatewayRequest.EMAIL, aPaymentDetails.getCustomerEmail());

	    request.Set(GatewayRequest.BILLING_ADDRESS, aPaymentDetails.getBillingAddress());
	    request.Set(GatewayRequest.BILLING_CITY, aPaymentDetails.getBillingCity());
	    request.Set(GatewayRequest.BILLING_STATE, aPaymentDetails.getBillingState());
	    request.Set(GatewayRequest.BILLING_ZIPCODE, aPaymentDetails.getBillingPostalCode());
	    request.Set(GatewayRequest.BILLING_COUNTRY, aPaymentDetails.getBillingCountry());
	    //request.Set(GatewayRequest.IPADDRESS, "68.224.133.117");

	    request.Set(GatewayRequest.CVV2_CHECK, "IGNORE");
	    request.Set(GatewayRequest.AVS_CHECK, "YES");
		return request;
	}

}
