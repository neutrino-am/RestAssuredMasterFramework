package com.tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.*;

public class VerifyPostCall {

    @Test
    public void test() {

        Response response = given()
                .header("Content-Type", ContentType.JSON)
                .log()
                .all()
                .body(new File(System.getProperty("user.dir")+ "/src/test/resources/TestData/test.json"))
                .post("https://reqres.in/api/users");

        response.prettyPrint();
    }
}

