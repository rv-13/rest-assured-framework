import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Test_01_GET {


    @Test
    void test_01() {
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println("Response:-" + response.getBody().asString());
        System.out.println("Response Time:-" + response.getTime());
        System.out.println("Status Code:-" + response.getStatusCode());
        System.out.println("Status Line:-" + response.getStatusLine());
        System.out.println("Content-Type:-" + response.getHeader("content-type"));

        Assert.assertEquals(response.getStatusCode(), 200);

    }

    @Test
    void test_02() {

        given()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data.id[0]", equalTo(7));
    }
}
