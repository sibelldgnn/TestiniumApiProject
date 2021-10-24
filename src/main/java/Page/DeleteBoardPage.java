package Page;

import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.given;

public class DeleteBoardPage {
    String key = "5d1603f57163a1aa90d88dcbe4194b20";
    String token = "290e9eb8e609dca9a2f687e1b9309d1bbde4d64f6fcbb1f63b30a2fd51614d1b";
    public DeleteBoardPage(){ }

    public void DeleteBoard(){

        given()
                .contentType("application/json")
                .pathParam("key", key)
                .pathParam("token", token)
                .when()
                .delete("/1/boards/617510a8bc7f9d47d91f7897?key={key}&token={token}")
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

}
