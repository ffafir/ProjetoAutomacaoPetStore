package Testes_PetStore_Fabiano.tests.pet.tests;

import Testes_PetStore_Fabiano.tests.base.tests.BaseTest;
import Testes_PetStore_Fabiano.tests.pet.requests.PetRequest;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

@Slf4j
@Feature("BuscarPetStatus")
public class BuscarPetPeloStatus extends BaseTest {

    PetRequest petRequest = new PetRequest();
    @Test
    @Tag("todos")
    @Description("Utilizar o campo de status para buscar um ou mais pets")
    public void buscarPetUtilizandoStatus() throws Exception{
        petRequest.BuscarPetStatus("pending")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body("[0].status", equalTo("pending"));
    }

}
