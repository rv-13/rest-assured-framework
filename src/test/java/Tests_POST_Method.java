import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Tests_POST_Method {
    private static String postUrl = "https://reqres.in/api/users";

    @Test
    public void test_01() {

        HashMap<String, Object> map = new HashMap<>();

        JSONObject requestbody = new JSONObject();
        requestbody.put("name", "morpheus");
        requestbody.put("job", "leader");
        System.out.println(requestbody);

        given()
                .body(requestbody.toJSONString())
                .when()
                .post(postUrl)
                .then()
                .statusCode(201);
    }
}
