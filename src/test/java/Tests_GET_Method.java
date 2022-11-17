import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Tests_GET_Method {
    private static String getUrl = "https://reqres.in/api/users?page=2";
    @Test
    public void test_01() {

        given()
                .get(getUrl)
                .then()
                .statusCode(200)
                .body("data.id[1]", equalTo(8))
                .body("data.first_name",hasItems("Michael","Lindsay","Tobias"));

    }
}
