package Testes_PetStore_Fabiano.tests.cadastro.tests;

import Testes_PetStore_Fabiano.tests.buscarPetInexistente.requests.BuscarPetInexistenteRequest;
import Testes_PetStore_Fabiano.tests.base.tests.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;


@Slf4j
@Feature("Buscar Pet pelo ID")
public class BuscarPetInexistenteTests extends BaseTest {

    BuscarPetInexistenteRequest buscarPetInexistenteRequest = new BuscarPetInexistenteRequest();

    @Test
    @Tag("Todos")
    @Description("Utilizar um ID inexistente para buscar um pet e validar o retorno apresentado")
    public void informarIDInvalidoBuscarPet() throws Exception{
        buscarPetInexistenteRequest.informarPetInexistente(000000)
                .then()
                .statusCode(HttpStatus.SC_NOT_FOUND)
                .body("message", equalTo("Pet not found"));
    }
}
