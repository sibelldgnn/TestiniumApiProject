package Page;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class PostBoardPage {
    ValidatableResponse jsonResponse;
    String key = "5d1603f57163a1aa90d88dcbe4194b20";
    String token = "290e9eb8e609dca9a2f687e1b9309d1bbde4d64f6fcbb1f63b30a2fd51614d1b";
    public String id;

    public PostBoardPage() {
    }

    public void setUp() {
        RestAssured.baseURI = "https://api.trello.com/";
    }

    public void postBoard() {

        Response response = given()
                .pathParam("key", key)
                .pathParam("token", token)
                .param("id", id)
                .contentType("application/xml")
                .when().log().all()
                .post("/1/boards/?name=" + "Testinium Project" + "&key={key}&token={token}");
    }

}
