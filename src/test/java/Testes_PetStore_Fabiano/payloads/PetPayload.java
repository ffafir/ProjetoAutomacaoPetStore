package Testes_PetStore_Fabiano.payloads;

import Testes_PetStore_Fabiano.payloads.model.Cadastro.PetModel;
import Testes_PetStore_Fabiano.utils.Utils;
import com.github.javafaker.Faker;
import com.google.gson.Gson;

public class PetPayload {

    public static Faker faker = Utils.faker;
    public static String toJson(int id, String nome, String status) {
        PetModel registerJson = new PetModel(faker.idNumber().hashCode(), faker.name().firstName(), status);
        return new Gson().toJson(registerJson);
    }

    public static String toJson(int id, String nome){
        PetModel alterarJson = new PetModel(faker.idNumber().hashCode(), faker.name().username(), "pending");
        return new Gson().toJson(alterarJson);
    }
}