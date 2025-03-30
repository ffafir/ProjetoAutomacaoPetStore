package Testes_ProjetoAutomatizarAPIs.tests.storeOrder.tests;

import Testes_ProjetoAutomatizarAPIs.tests.base.tests.BaseTest;
import Testes_ProjetoAutomatizarAPIs.tests.storeOrder.requests.storeOrderRequest;
import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;

@Feature("Cadastrar ordem para loja")
public class cadastrarStoreOrder extends BaseTest {

    storeOrderRequest storeOrder = new storeOrderRequest();
    Faker faker = new Faker();

    @Test
    @Tag("todos")
    @Description("Deverá cadastrar uma ordem de serviço para loja relacionado a pet com campo complete verdadeiro")
    public void cadastrarStoreOrderComCompleteVerdadeiro() throws Exception {
        storeOrder.criarOrdem(true)
                .then()
                .statusCode(200)
                .body("complete", equalTo(true));
    }

    @Test
    @Tag("todos")
    @Description("Deverá cadastrar uma ordem de serviço para loja relacionado a pet com campo complete verdadeiro")
    public void cadastrarStoreOrderComCompleteFalso() throws Exception {
        storeOrder.criarOrdem(false)
                .then()
                .statusCode(200)
                .body("complete", equalTo(false));
    }

    @Test
    @Tag("todos")
    @Description("Deverá cadastrar uma ordem de serviço para loja relacionado a pet com campo complete verdadeiro")
    public void cadastrarStoreFornecendoTodosDados() throws Exception {
        int id = faker.number().numberBetween(1, 100);

        storeOrder.criarOrdem(id, faker.number().randomDigit(), faker.number().randomDigit(), "2025-12-12", "delivered", false)
                .then()
                .statusCode(200)
                .body("complete", equalTo(false), "id", equalTo(id));
    }

    @Test
    @Tag("schemas")
    @Description("Deve validar o schema json da storeOrder")
    public void deveValidarSchemaStoreOrder() throws Exception {
        storeOrder.criarOrdem(faker.number().randomDigit(), faker.number().randomDigit(), faker.number().randomDigit(), "2025-12-12", "delivered", false)
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("schemas/storeOrder/storeOrderSchema.json"));
    }
}
