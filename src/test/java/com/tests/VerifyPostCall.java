package com.tests;

import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.testng.Assert;
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

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(response.getHeader("Content-Type"),"application/json; charset=utf-8");
        Assert.assertTrue(response.getTime() < 2000,"Response time is less than 2 sec");

        response.then().body(JsonSchemaValidator.matchesJsonSchema( new File (System.getProperty("user.dir")+ "/src/test/resources/schemas/schema.json")));

    }
}

