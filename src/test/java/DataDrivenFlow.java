import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DataDrivenFlow {

    private static String postUrl = "https://reqres.in/api/users";

    @DataProvider(name = "dataProviderForPostcalls")
    public Object[][] dataProvider() {

        return new Object[][]{
                {"Ram1", "General Manager"},
                {"Shyam1", "CEO"},
                {"Lakshman1", "Leader"},
                {"Ram2", "General Manager"},
                {"Shyam2", "CEO"},
                {"Lakshman2", "Leader"},
                {"Ram3", "General Manager"},
                {"Shyam3", "CEO"},
                {"Lakshman3", "Leader"}
        };
    }

    @Test(dataProvider = "dataProviderForPostcalls")
    public void test_01(String name, String job) {
        JSONObject requestbody = new JSONObject();
        requestbody.put("name", name);
        requestbody.put("job", job);
        System.out.println("requestbody created :-" + requestbody);

        given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .body(requestbody.toJSONString())
                .when()
                .post(postUrl)
                .then()
                .statusCode(201)
                .log().all();

    }
}
