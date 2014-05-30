package com.v2.payment.service;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class PaymentServiceTest {

	// http://localhost:8080/RESTfulExample/json/product/post
	public static void main(String[] args) {

//		try {
//
//			DefaultHttpClient httpClient = new DefaultHttpClient();
//			HttpPost postRequest = new HttpPost(
//					"http://localhost:8080/payment/rest/payment/auth/");
//
//			StringEntity input = new StringEntity(
//					"{\"qty\":100,\"name\":\"iPad 4\"}");
//			
////			StringEntity input = new StringEntity(
////					"{\"cardNumber\":5555555555554444,\"expiryMonth\":8,\"expiryYear\":2015,\"amount\":10.97}");
//			input.setContentType("application/json");
//			postRequest.setEntity(input);
//
//			HttpResponse response = httpClient.execute(postRequest);
//
//			if (response.getStatusLine().getStatusCode() != 201) {
//				throw new RuntimeException("Failed : HTTP error code : "
//						+ response.getStatusLine().getStatusCode());
//			}
//
//			BufferedReader br = new BufferedReader(new InputStreamReader(
//					(response.getEntity().getContent())));
//
//			String output;
//			System.out.println("Output from Server .... \n");
//			while ((output = br.readLine()) != null) {
//
//				System.out.println(output);
//			}
//
//			httpClient.getConnectionManager().shutdown();
//
//		} catch (MalformedURLException e) {
//
//			e.printStackTrace();
//		} catch (IOException e) {
//
//			e.printStackTrace();
//
//		}

//        ClientConfig config = new DefaultClientConfig();
//        Client client = Client.create(config);
//        WebResource service = client.resource(UriBuilder.fromUri("http://restUrl").build());
//        Form form = new Form();
//        form.add("name1", "value1");
//        form.add("name2", "value1");
//        ClientResponse response = service.path("restPath").path("resourcePath").
//        type(MediaType.APPLICATION_FORM_URLENCODED).post(ClientResponse.class, form);
//        System.out.println("Response " + response.getEntity(String.class));
	}

}

