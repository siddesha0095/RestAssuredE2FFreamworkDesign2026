package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class LoginAPITest3 {

    @Test(description = "Verify if Login API is working...")
    public void loginTest() {
       AuthService authservice=new AuthService();
       Response response=authservice.login("{\\\"username\\\": \\\"siddesha0095\\\",\\\"password\\\": \\\"Navaneeth22#\\\"}");
       System.out.println(response.asPrettyString());
    }
}

