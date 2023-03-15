package Testes_PetStore_Fabiano.payloads;

import Testes_PetStore_Fabiano.payloads.model.Cadastro.PetModel;
import Testes_PetStore_Fabiano.utils.Utils;
import com.github.javafaker.Faker;
import com.google.gson.Gson;

public class PetPayload {

    public static Faker faker = Utils.faker;
    public static String toJson(int id, String name, String status) {
        PetModel registerJson = new PetModel(id, name, status);
        return new Gson().toJson(registerJson);
    }

    public static String toJson(int id, String name){
        PetModel alterarJson = new PetModel(id, name, "pending");
        return new Gson().toJson(alterarJson);
    }

    public static String toJson(String status){
        PetModel buscarPetStatus = new PetModel(10, "doguinho", status);
        return new Gson().toJson(buscarPetStatus);
    }
}