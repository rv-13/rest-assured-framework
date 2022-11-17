import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Tests_PATCH_Method {
    private static String patchUrl = "https://reqres.in/api/users/2";

    @Test
    public void test_01() {
        JSONObject requestbody = new JSONObject();
        requestbody.put("name", "morpheusUpdated");
        requestbody.put("job", "leader");
        System.out.println(requestbody);

        given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(requestbody.toJSONString())
                .when()
                .patch(patchUrl)
                .then()
                .statusCode(200)
                .log().all();
    }
}
