package com.src.client;

import java.util.Map;

import org.springframework.http.HttpMethod;

public class RequestAndHeaderDetails {
	
	private String url;
	private HttpMethod requestType;
	private Map<String, String> headerParams;
	
	public RequestAndHeaderDetails(String url, HttpMethod requestType, Map<String, String> headerParams) {
		super();
		this.url = url;
		this.requestType = requestType;
		this.headerParams = headerParams;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public HttpMethod getRequestType() {
		return requestType;
	}
	public void setRequestType(HttpMethod requestType) {
		this.requestType = requestType;
	}
	public Map<String, String> getHeaderParams() {
		return headerParams;
	}
	public void setHeaderParams(Map<String, String> headerParams) {
		this.headerParams = headerParams;
	}
	
	@Override
	public String toString() {
		return "RequestAndHeaderDetails [url=" + url + ", requestType=" + requestType + ", headerParams=" + headerParams
				+ "]";
	}
	
}