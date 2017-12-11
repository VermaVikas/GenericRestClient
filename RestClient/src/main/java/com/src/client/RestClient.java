package com.src.client;

import java.util.HashMap;
import java.util.Map;

import com.src.entity.User;
import com.src.helper.InputHelper;
import com.src.util.ResponseData;

public class RestClient {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
			
		RestCall<String, String> restCall = new RestCall<>();
		System.out.println("started");
		String response = restCall.getRequest("http://localhost:8787/ems-api/pfc/check", String.class);
		System.out.println("## response ::"+response);
		
		System.out.println("\n");
		
		InputHelper iH = new InputHelper();
		iH.setUserName("UserName");
		
		RestCall<InputHelper, ResponseData> restCall1 = new RestCall<>();
		ResponseData<User> response1 = restCall1.postRequest("http://localhost:8787/ems-api/pfc/getUserListByDept", iH, ResponseData.class);
		System.out.println("## response1 ::"+response1);
		
		System.out.println("\n");
		
		RestCall<String, ResponseData> restCall2 = new RestCall<>();
		ResponseData response2 = restCall2.getRequest("http://localhost:8787/ems-api/pfc/check", ResponseData.class);
		System.out.println("## response2 ::"+response2);
		
		System.out.println("\n");
		
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("bearer-key", "abcbearerxyz");
		InputHelper iH3 = new InputHelper();
		iH3.setUserName("UserName");
		
		RestCall<InputHelper, ResponseData> restCall3 = new RestCall<>();
		ResponseData<User> response3 = restCall3.postRequest("http://localhost:8787/ems-api/pfc/getUserListByName", headers, iH3, ResponseData.class);
		System.out.println("## response3 ::"+response3);
		
	}
	
}
