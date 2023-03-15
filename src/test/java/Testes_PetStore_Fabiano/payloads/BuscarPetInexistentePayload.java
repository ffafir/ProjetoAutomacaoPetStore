package Testes_PetStore_Fabiano.payloads;

import Testes_PetStore_Fabiano.payloads.model.BuscarPet.BuscarPetInexistenteModel;
import com.google.gson.Gson;

public class BuscarPetInexistentePayload {
    public static String toJson(int idPet)
    {
        BuscarPetInexistenteModel buscarPet = new BuscarPetInexistenteModel(idPet);
        return new Gson().toJson(buscarPet);
    }
}
