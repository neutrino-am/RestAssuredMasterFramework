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

//        1. Create dummy user by making post call to https://reqres.in/api/users
//        2. Drive your test with the given json file.
//        3. Ideally there should be only one test which have to run two times with the two set of data
//        given below.
//        [
//        {
//        "name": "admin",
//        "job": "admin"
//        },
//        {
//        "name": "ronaldo",
//        "job": "player"
//        }
//        ]
//        4. Receive the response from the Reqres server and assert the following components,
//        Response code
//        Response schema
//        Response time is within 2 seconds
//        Response header has “Content-Type” with value containing “application/json”
//        Response can be deserialized to POJO
// 5. README