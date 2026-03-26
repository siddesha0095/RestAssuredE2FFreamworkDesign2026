package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.model.request.LoginRequest;
import com.api.model.response.LoginResponse;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITestwithRequestModel4 {

	@Test(description = "Verify if Login API is working...")
	public void loginTest() {

		LoginRequest loginrequest = new LoginRequest("siddesha0095", "Navaneeth22#");
		AuthService authservice = new AuthService();
		Response response = authservice.login(loginrequest);
		System.out.println(response.asPrettyString());
		
		LoginResponse loginResponse=response.as(LoginResponse.class);
		
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getEmail());
		System.out.println(loginResponse.getId());
		
		Assert.assertTrue(loginResponse.getToken() != null);
		Assert.assertEquals(loginResponse.getEmail(), "siddesha0095@gmail.com");
		Assert.assertEquals(loginResponse.getId(), 4807);


	}
}
