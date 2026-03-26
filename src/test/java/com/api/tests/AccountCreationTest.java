package com.api.tests;

import org.testng.Assert;        // for Assert methods
import io.restassured.response.Response;  // for Response object
import org.testng.annotations.Test;
import com.api.base.AuthService;
import com.api.model.request.SignUpRequest;


import io.restassured.response.Response;


public class AccountCreationTest {
    @Test(description = "Verify if SignUP API is working...")
    public void createAccountTest() {
        SignUpRequest signUpRequest = new SignUpRequest.Builder()
            .userName("manosha1")
            .email("disha1231112@gmail.com")
            .firstName("manu")
            .password("disha@123")
            .lastName("Bhatt")
            .mobileNumber("7777777776")
            .build();

        AuthService authService = new AuthService();
        Response response=authService.signUp(signUpRequest);
        
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
     
       

        
        
    }
}

