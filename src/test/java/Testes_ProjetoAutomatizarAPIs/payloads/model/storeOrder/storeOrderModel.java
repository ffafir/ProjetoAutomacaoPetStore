package Testes_ProjetoAutomatizarAPIs.payloads.model.storeOrder;

import lombok.Data;

@Data
public class storeOrderModel {
    public int id;
    public int petId;
    public int quantity;
    public String shipDate;
    public String status;
    public String complete;

    public storeOrderModel(int id, int petId, int quantity, String shipDate, String status, boolean complete) {
        this.id = id;
        this.petId = petId;
        this.quantity = quantity;
        this.shipDate = shipDate;
        this.status = status;
        this.complete = Boolean.toString(complete);
    }
}
