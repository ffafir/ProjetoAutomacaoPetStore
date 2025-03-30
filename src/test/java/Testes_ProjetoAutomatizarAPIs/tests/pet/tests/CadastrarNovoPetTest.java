package Testes_ProjetoAutomatizarAPIs.tests.pet.tests;

import Testes_ProjetoAutomatizarAPIs.tests.pet.requests.PetRequest;
import Testes_ProjetoAutomatizarAPIs.tests.base.tests.BaseTest;
import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Slf4j
@Feature("Cadastro")
public class CadastrarNovoPetTest extends BaseTest {

    PetRequest petRequest = new PetRequest();

    Faker faker = new Faker();
    @Test
    @Tag("todos")
    @Description("Realizar o cadastro de um pet.")
    public void deveCadastrarComSucessoPet() throws Exception{
        petRequest.register(123456753, faker.animal().name(), "pending")
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
