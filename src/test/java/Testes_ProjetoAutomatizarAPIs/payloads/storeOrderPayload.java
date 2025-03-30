package Testes_ProjetoAutomatizarAPIs.payloads;

import Testes_ProjetoAutomatizarAPIs.payloads.model.storeOrder.storeOrderModel;
import Testes_ProjetoAutomatizarAPIs.utils.Utils;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import lombok.Data;

@Data
public class storeOrderPayload {

    public static Faker faker = Utils.faker;

    public static String toJson(boolean complete)
    {
        storeOrderModel storeOrderModel = new storeOrderModel(faker.number().randomDigitNotZero(), faker.number().randomDigit(), faker.number().numberBetween(0, 100), "2025-10-29", "approved", complete);
        return new Gson().toJson(storeOrderModel);
    }

    public static String toJson(int id, int petId, int quantity, String shipDate, String status, boolean complete)
    {
        storeOrderModel storeOrderModel = new storeOrderModel(id, petId, quantity, shipDate, status, complete);
        return new Gson().toJson(storeOrderModel);
    }
}
