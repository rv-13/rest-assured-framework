import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Tests_POST_Method {
    private static String postUrl = "https://reqres.in/api/users";

    @Test
    public void test_01() {
        JSONObject requestbody = new JSONObject();
        requestbody.put("name", "morpheus");
        requestbody.put("job", "leader");
        System.out.println(requestbody);

        given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(requestbody.toJSONString())
                .when()
                .post(postUrl)
                .then()
                .statusCode(201);
    }
}
