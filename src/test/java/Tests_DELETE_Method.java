import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Tests_DELETE_Method {
    private static String deleteUrl = "https://reqres.in/api/users/2";


    @Test
    public void test_01() {

        given()
                .delete(deleteUrl)
                .then()
                .statusCode(204)
                .log().all();
    }


}
