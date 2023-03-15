package Testes_PetStore_Fabiano.payloads.model.BuscarPet;

public class BuscarPetInexistenteModel {
    private int idPet;


    // Getter Methods
    public int getCode() {
        return idPet;
    }

    // Setter Methods

    public void setCode( int code ) {
        this.idPet = code;
    }
    public BuscarPetInexistenteModel(int idPet)
    {
        this.idPet = idPet;
    }
}
