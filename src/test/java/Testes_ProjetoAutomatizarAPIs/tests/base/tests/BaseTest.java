package Testes_ProjetoAutomatizarAPIs.tests.base.tests;

import Testes_ProjetoAutomatizarAPIs.utils.Utils;
import io.restassured.RestAssured;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;

@Slf4j
public class BaseTest {

    @BeforeAll
    public static void setUp() {
        log.info("Iniciando os testes de API.");
        RestAssured.baseURI = Utils.getBaseUrl();
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
