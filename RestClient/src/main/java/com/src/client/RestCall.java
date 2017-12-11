package com.src.client;

import java.io.IOException;
import java.util.Map;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

public class RestCall<T, V> {

	public V getRequest(String url, Class<V> responseEntity) {
		ResponseErrorHandler responseHandler = new ResponseErrorHandler() {
			@Override
			public boolean hasError(ClientHttpResponse response) throws IOException {
				if (response.getStatusCode() != HttpStatus.OK) {
					System.out.println(response.getStatusText());
				}
				return response.getStatusCode() == HttpStatus.OK ? false : true;
			}
			@Override
			public void handleError(ClientHttpResponse response) throws IOException {
				// TODO Auto-generated method stub
			}
		};
		try {
			V responseBody = new GenericRestClient<T, V>().executeRequest(new RequestDetails(url, HttpMethod.GET), null, responseHandler, responseEntity);
			return responseBody;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	public V postRequest(String url, T data, Class<V> responseEntity) {

		ResponseErrorHandler responseHandler = new ResponseErrorHandler() {
			@Override
			public boolean hasError(ClientHttpResponse response) throws IOException {
				if (response.getStatusCode() != HttpStatus.OK) {
					System.out.println(response.getStatusText());
				}
				return response.getStatusCode() == HttpStatus.OK ? false : true;
			}
			@Override
			public void handleError(ClientHttpResponse response) throws IOException {
				// TODO Auto-generated method stub
			}
		};
		try {
			V responseBody = new GenericRestClient<T, V>().executeRequest(new RequestDetails(url, HttpMethod.POST), data, responseHandler, responseEntity);
			return responseBody;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public V getRequest(String url, Map<String, String> headers, T data, Class<V> responseEntity) {

		ResponseErrorHandler responseHandler = new ResponseErrorHandler() {
			@Override
			public boolean hasError(ClientHttpResponse response) throws IOException {
				if (response.getStatusCode() != HttpStatus.OK) {
					System.out.println(response.getStatusText());
				}
				return response.getStatusCode() == HttpStatus.OK ? false : true;
			}
			@Override
			public void handleError(ClientHttpResponse response) throws IOException {
				// TODO Auto-generated method stub
			}
		};
		try {
			V responseBody = new GenericRestClient<T, V>().executeRequestWithHeaders(new RequestAndHeaderDetails(url, HttpMethod.GET, headers), data, responseHandler, responseEntity);
			return responseBody;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public V postRequest(String url, Map<String, String> headers, T data, Class<V> responseEntity) {

		ResponseErrorHandler responseHandler = new ResponseErrorHandler() {
			@Override
			public boolean hasError(ClientHttpResponse response) throws IOException {
				if (response.getStatusCode() != HttpStatus.OK) {
					System.out.println(response.getStatusText());
				}
				return response.getStatusCode() == HttpStatus.OK ? false : true;
			}
			@Override
			public void handleError(ClientHttpResponse response) throws IOException {
				// TODO Auto-generated method stub
			}
		};
		try {
			V responseBody = new GenericRestClient<T, V>().executeRequestWithHeaders(new RequestAndHeaderDetails(url, HttpMethod.POST, headers), data, responseHandler, responseEntity);
			return responseBody;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
}
