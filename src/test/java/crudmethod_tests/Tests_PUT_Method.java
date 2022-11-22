package crudmethod_tests;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Tests_PUT_Method {
    private static String putUrl = "https://reqres.in/api/users/2";


    @Test
    public void test_01() {
        JSONObject requestbody = new JSONObject();
        requestbody.put("name", "morpheus");
        requestbody.put("job", "leader");
        System.out.println("Payload created :-" + requestbody);

        given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(requestbody.toJSONString())
                .when()
                .put(putUrl)
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void test_02() {
        JSONObject requestbody = new JSONObject();
        requestbody.put("name", "morpheus1");
        requestbody.put("job", "leader");
        System.out.println("Payload created :-" + requestbody);

        given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(requestbody.toJSONString())
                .when()
                .put(putUrl)
                .then()
                .statusCode(200)
                .log().all();
    }

}
