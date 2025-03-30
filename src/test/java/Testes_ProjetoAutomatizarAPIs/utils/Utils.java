package Testes_ProjetoAutomatizarAPIs.utils;

import com.github.javafaker.Faker;
import org.junit.Assert;

import java.util.Locale;

public class Utils {

    public static Faker faker = new Faker(new Locale("pt-BR"));

    public enum Env {
        DEV, HML, PRD
    }

    public static String getBaseUrl() {
        String baseUrl = null;
        Env env = envStringToEnum();

        switch (env) {
            case DEV:
                baseUrl = "https://dev.petstore.swagger.io/v2";
                break;
            case HML:
                baseUrl = "https://hml.petstore.swagger.io/v2";
                break;
            case PRD:
                baseUrl = "https://petstore.swagger.io/v2";
                break;
            default:
                Assert.fail("Ambiente não configurado");
        }
        return baseUrl;
    }

    public static Env envStringToEnum() {
        try {
            return Env.valueOf(getEnv());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Ambiente não existente: " + getEnv());
        }
    }


    public static String getEnv() {

        String env = System.getProperty("env");

    if (env == null || env.isBlank()) {
        return "PRD";
    }

        return env.toUpperCase(Locale.ROOT);
    }


}