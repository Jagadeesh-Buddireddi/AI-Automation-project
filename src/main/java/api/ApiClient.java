package api;

import config.ConfigReader;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiClient {

    private static final String BASE_URL = ConfigReader.getProperty("API.URL");

    public static Response getUserDetails(String userId) {
        return given()
                .baseUri(BASE_URL)
                .when()
                .get("/users/" + userId)
                .then()
                .extract().response();
    }
}
