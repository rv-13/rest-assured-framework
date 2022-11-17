import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import static io.restassured.RestAssured.given;

public class Tests_GET_Method {

    @Test
    public void test_01() {

        given()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .log().all();

    }
}
