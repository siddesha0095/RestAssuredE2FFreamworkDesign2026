package com.api.base;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

import com.api.model.request.LoginRequest;

public class BaseService { // wrapper for Rest Assured!!
    // BASE Uri
    // CREATING THE REQUEST
    // HANDLING THE RESPONSE

    private static final String BASE_URL = "http://64.227.160.186:8080";
    private RequestSpecification requestSpecification;

    public BaseService() {
        requestSpecification = given().baseUri(BASE_URL);
    }

    protected Response postRequest(Object  payload, String endpoint) {
        return requestSpecification
                .contentType(ContentType.JSON)
                .body(payload)
                .post(endpoint);
    }
}