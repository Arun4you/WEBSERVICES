package com.example.service;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		java.net.URL endpointUrl = new java.net.URL("http://localhost:7001/CalculatorServicee/services/CalService");
		
		org.apache.axis.client.Service service = new org.apache.axis.client.Service();
		
		CalServiceSoapBindingStub stub = new CalServiceSoapBindingStub(endpointUrl, service);
		
		int result = stub.add(10, 10);
		System.out.println("ADD RESULT: "+ result);
		
		int subresult = stub.sub(10, 10); 
		System.out.println("SUB RESULT: "+ subresult);
	}

}
