package com.src.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.src.entity.User;
import com.src.helper.InputHelper;
import com.src.util.ResponseData;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@RequestMapping(value = "/check", method = RequestMethod.GET)
    public ResponseEntity<ResponseData<String>> test() {
		System.out.println("PFC check request");
		ResponseData<String> rData = new ResponseData<String>();
		rData.setSuccessMessage("Response Success");
		
		return new ResponseEntity<ResponseData<String>>(rData, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/getUserListByDept", method = RequestMethod.POST)
    public ResponseEntity<ResponseData<List<User>>> getFeatureListByProductKey(@RequestBody InputHelper inputObj) {
		System.out.println("getFeatureListByProductKey > licenseKey: "+inputObj.getuserDept());
		
		ResponseData<List<User>> rData = new ResponseData<List<User>>();
		rData.setSuccessData(User.getTempUser());
		
		return new ResponseEntity<ResponseData<List<User>>>(rData, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/getUserListByName", method = RequestMethod.POST)
    public ResponseEntity<ResponseData<List<User>>> getFeatureListByProductKey1(
    		@RequestHeader(name="bearer-key") String bearerKey, @RequestBody InputHelper inputObj) {
		System.out.println("getFeatureListByProductKey > bearerKey: "+bearerKey);
		System.out.println("getFeatureListByProductKey > licenseKey: "+inputObj.getUserName());
		
		ResponseData<List<User>> rData = new ResponseData<List<User>>();
		rData.setSuccessData(User.getTempUser());
		
		return new ResponseEntity<ResponseData<List<User>>>(rData, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/testPut/{id}", method = RequestMethod.PUT)
    public ResponseEntity<ResponseData<List<User>>> testPut(
    		//@RequestHeader(name="bearer-key") String bearerKey, 
    		@PathVariable(name="id") String id) {
		//System.out.println("getFeatureListByProductKey > bearerKey: "+bearerKey);
		System.out.println("testPut > id : "+id);
		
		ResponseData<List<User>> rData = new ResponseData<List<User>>();
		rData.setSuccessData(User.getTempUser());
		
		return new ResponseEntity<ResponseData<List<User>>>(rData, HttpStatus.OK);
    }
	
}
