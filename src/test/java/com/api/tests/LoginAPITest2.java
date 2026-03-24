package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class LoginAPITest2 {

    @Test(description = "Verify if Login API is working...")
    public void loginTest() {
        //baseURI = "http://64.227.160.186:8080"; // used static import so no need of RestAssured.baseURI
        
       Response response = given().baseUri("http://64.227.160.186:8080")
    		   .header("Content-Type", "application/json").body("{\"username\": \"siddesha0095\",\"password\": \"Navaneeth22#\"}").post("/api/auth/login");
        System.out.println(response.asPrettyString());
        
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}

