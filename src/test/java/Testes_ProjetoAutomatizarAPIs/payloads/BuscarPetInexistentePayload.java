package Testes_ProjetoAutomatizarAPIs.payloads;

import Testes_ProjetoAutomatizarAPIs.payloads.model.BuscarPet.BuscarPetInexistenteModel;
import com.google.gson.Gson;

public class BuscarPetInexistentePayload {
    public static String toJson(int idPet)
    {
        BuscarPetInexistenteModel buscarPet = new BuscarPetInexistenteModel(idPet);
        return new Gson().toJson(buscarPet);
    }
}
