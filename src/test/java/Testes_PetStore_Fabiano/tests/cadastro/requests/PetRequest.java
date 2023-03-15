package Testes_PetStore_Fabiano.tests.cadastro.requests;

import Testes_PetStore_Fabiano.payloads.PetPayload;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PetRequest {
    private final String PATH_PET = "/pet";

    @Step("Cadastrar um novo pet.")
    public Response register(int id, String nome, String status) {
        return given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
            .when()
                .body(PetPayload.toJson(id, nome, status))
                .post(PATH_PET);
    }

    @Step("Informar um pet Inexistente")
    public Response informarPetInexistente(int id)
    {
        return given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .when()
                .pathParam("petId", id)
                .get(PATH_PET + "/{petId}");
    }

    @Step("Alterar um pet existente")
    public Response AlterarPetExistente(int id, String name)
    {
        return given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .when()
                .body(PetPayload.toJson(id, name))
                .put(PATH_PET);
    }


}
