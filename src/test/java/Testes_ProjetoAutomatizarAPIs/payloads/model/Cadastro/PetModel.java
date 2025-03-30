package Testes_ProjetoAutomatizarAPIs.payloads.model.Cadastro;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PetModel {

    private Integer id;
    private String name;
    private String status;
    private List<String> photoUrls;
    private Category category;
    private List<Tag> tags;

    @Getter
    @Setter
    public static class Category {
        private Integer id;
        private String name;
    }

    @Getter
    @Setter
    public static class Tag {
        private Integer id;
        private String name;
    }
}