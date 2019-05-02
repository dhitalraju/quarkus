package global.citytech.rest;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.json.Json;
import javax.json.JsonObject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;


/**
 * @author rajudhital on 5/1/19
 * @project quarkus
 */
@QuarkusTest
public class PingResourceTest {

    @Test
    public void doPingTest() {
        JsonObject object = Json.createObjectBuilder()
                .add("code", 0)
                .add("message", "SUCCESS")
                .build();
        given()
                .when().get("/quarkus/v1/ping")
                .then()
                .statusCode(200)
                .body(is("{\"code\":0,\"message\":\"SUCCESS\"}"));
    }
}
