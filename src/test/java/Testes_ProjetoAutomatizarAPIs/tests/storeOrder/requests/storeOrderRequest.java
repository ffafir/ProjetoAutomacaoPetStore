package Testes_ProjetoAutomatizarAPIs.tests.storeOrder.requests;

import Testes_ProjetoAutomatizarAPIs.payloads.storeOrderPayload;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class storeOrderRequest {

    private final String PATH_STORE_ORDER = "/store/order";

    @Step("Criar uma ordem para loja")
    public Response criarOrdem(boolean complete){
        return given()
                    .header("accept", "application/json")
                    .header("Content-Type", "application/json")
                .when()
                    .body(storeOrderPayload.toJson(complete))
                    .post(PATH_STORE_ORDER);
    }

    @Step("Criar uma ordem para loja")
    public Response criarOrdem(int id, int petId, int quantity, String shipDate, String status, boolean complete){
        return given()
                    .header("accept", "application/json")
                    .header("Content-Type", "application/json")
                .when()
                    .body(storeOrderPayload.toJson(id, petId, quantity, shipDate, status, complete))
                    .post(PATH_STORE_ORDER);
    }

}
