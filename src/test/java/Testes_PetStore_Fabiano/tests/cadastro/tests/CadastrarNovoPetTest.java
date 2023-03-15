package Testes_PetStore_Fabiano.tests.cadastro.tests;

import Testes_PetStore_Fabiano.tests.cadastro.requests.PetRequest;
import Testes_PetStore_Fabiano.tests.base.tests.BaseTest;
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
    @Tag("Todos")
    @Description("Realizar o cadastro de um pet.")
    public void deveCadastrarComSucessoPet() throws Exception{
        petRequest.register(10,faker.animal().name(), "available")
                .then()
                .statusCode(HttpStatus.SC_OK);
    }


}
