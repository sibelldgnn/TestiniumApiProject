package Page;

import static io.restassured.RestAssured.given;

public class PostCardPage {

    String key = "5d1603f57163a1aa90d88dcbe4194b20";
    String token = "290e9eb8e609dca9a2f687e1b9309d1bbde4d64f6fcbb1f63b30a2fd51614d1b";
    public PostCardPage(){ }

    public void postedCardPage() {

        given()
                .contentType("application/json")
                .pathParam("key", key)
                .pathParam("token", token)
                .when()
                .post("/1/cards?key={key}&token={token}&idList=617505a215e09812b706174e&name=trello Api")
                .then()
                .statusCode(200).extract().response();
    }

    public void postedCardPage2() {

        given()
                .contentType("application/json")
                .pathParam("key", key)
                .pathParam("token", token)
                .when()
                .post("/1/cards?key={key}&token={token}&idList=617505a215e09812b706174e&name=trello Api Test")
                .then()
                .statusCode(200).extract().response();
    }
}
