package Testes_ProjetoAutomatizarAPIs.tests.buscarPetInexistente.requests;


import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class BuscarPetInexistenteRequest {
    private final String PATH_BuscarPet = "/pet";

    @Step("Informar um pet Inexistente")
    public Response informarPetInexistente(int id)
    {
        return given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
            .when()
                .pathParam("petId", id)
                .get(PATH_BuscarPet + "/{petId}");
    }

}
