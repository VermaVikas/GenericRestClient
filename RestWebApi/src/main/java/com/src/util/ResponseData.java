package com.src.util;

public class ResponseData<T> {
	
	private boolean status;
	//private String errorCode;
	private String message;
	private T data;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	/*public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}*/
	
	public void setSuccessMessageData(String message, T entityData) {
		setStatus(true);
		setMessage(message);
		setData(entityData);
	}
	
	public void setSuccessData(T entityData) {
		setStatus(true);
		setData(entityData);
	}
	
	public void setSuccessMessage(String message) {
		setStatus(true);
		setMessage(message);
	}
	
	public void setFailureMessage(String message, String erroCode) {
		setStatus(false);
		//setErrorCode(erroCode);
		setMessage(message);
	}
}
