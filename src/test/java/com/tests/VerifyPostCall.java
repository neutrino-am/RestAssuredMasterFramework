package com.tests;

import org.testng.annotations.Test;

public class VerifyPostCall {

    @Test
    public void test() {

        // https://reqres.in/api/users
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