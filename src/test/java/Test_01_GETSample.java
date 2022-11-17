import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Test_01_GETSample {

    private static String getUrl = "https://reqres.in/api/users?page=2";

    @Test
    void test_01() {
        Response response = get(getUrl);
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
                .get(getUrl)
                .then()
                .statusCode(200)
                .body("data.id[0]", equalTo(7));
    }

    //Mocked Json Server Test_03 sample

    @Test
    public void test_03(){
        basePath = "http://localhost:3000";
        given()
                .get(basePath+"/posts")
                .then()
                .statusCode(200)
                .log().all();
    }
}
