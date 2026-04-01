package com.api.tests;

import org.testng.Assert;        // for Assert methods
import io.restassured.response.Response;  // for Response object
import org.testng.annotations.Test;
import com.api.base.AuthService;
import com.api.model.request.SignUpRequest;


import io.restassured.response.Response;


public class ForgotPassowrdTest {
    @Test(description = "Verify if forgot password  API is working...")
    public void forgotPassowrdTest() {
        
        AuthService authService = new AuthService();
       Response response= authService.forgotPassword("siddesha094@gmail.com");
      
        
        System.out.println(response.asPrettyString());
        //Assert.assertEquals(response.asPrettyString(), "If an account exists with the provided email, you will receive password reset instructions.");
     
       

        
        
    }
}

