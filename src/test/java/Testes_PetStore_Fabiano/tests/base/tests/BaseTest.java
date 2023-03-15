package Testes_PetStore_Fabiano.tests.base.tests;

import io.restassured.RestAssured;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;

@Slf4j
public class BaseTest {

    @BeforeAll
    public static void setUp() {
        log.info("Iniciando os testes de API.");
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
