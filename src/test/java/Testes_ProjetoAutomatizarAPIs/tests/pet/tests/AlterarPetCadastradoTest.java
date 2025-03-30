package Testes_ProjetoAutomatizarAPIs.tests.pet.tests;


import Testes_ProjetoAutomatizarAPIs.tests.base.tests.BaseTest;
import Testes_ProjetoAutomatizarAPIs.tests.pet.requests.PetRequest;
import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

@Slf4j
@Feature("Alterar Pet Existente")
public class AlterarPetCadastradoTest extends BaseTest {

    PetRequest petRequest = new PetRequest();

    Faker faker = new Faker();

    @Test
    @Tag("todos")
    @Description("Alterar um Pet existente.")
    public void alterarPet() throws Exception{
        String animal = faker.animal().toString();
        petRequest.AlterarPetExistente(10, animal, "pending")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body("name", equalTo(animal));
    }
}
