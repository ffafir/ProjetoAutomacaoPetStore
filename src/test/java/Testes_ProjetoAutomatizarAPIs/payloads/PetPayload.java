package Testes_ProjetoAutomatizarAPIs.payloads;

import Testes_ProjetoAutomatizarAPIs.payloads.model.Cadastro.PetModel;
import Testes_ProjetoAutomatizarAPIs.payloads.model.Cadastro.PetModel.Category;
import Testes_ProjetoAutomatizarAPIs.payloads.model.Cadastro.PetModel.Tag;
import Testes_ProjetoAutomatizarAPIs.utils.Utils;
import com.github.javafaker.Faker;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class PetPayload {

    public static Faker faker = Utils.faker;

    // Método para criar o JSON completo utilizando todos os campos
    public static String toJsonComplete(int id, String name, String status) {
        // Criar o objeto Category
        Category category = new Category();
        category.setId(faker.number().numberBetween(1, 10));
        category.setName(faker.animal().name());

        // Criar a lista de Tags
        Tag tag1 = new Tag();
        tag1.setId(faker.number().numberBetween(1, 100));
        tag1.setName("friendly");

        Tag tag2 = new Tag();
        tag2.setId(faker.number().numberBetween(101, 200));
        tag2.setName("playful");

        List<Tag> tags = Arrays.asList(tag1, tag2);

        // Criar a lista de photoUrls
        List<String> photoUrls = Arrays.asList(
                "https://example.com/photo1.jpg",
                "https://example.com/photo2.jpg"
        );

        // Montar o modelo completo
        PetModel completePet = new PetModel();
        completePet.setId(id);
        completePet.setName(name);
        completePet.setStatus(status);
        completePet.setCategory(category);
        completePet.setTags(tags);
        completePet.setPhotoUrls(photoUrls);

        // Retornar o JSON gerado
        return new Gson().toJson(completePet);
    }

    // Método atualizado para JSON básico (sem listas e objetos aninhados)
    public static String toJsonBasic(int id, String name, String status) {
        PetModel basicPet = new PetModel();
        basicPet.setId(id);
        basicPet.setName(name);
        basicPet.setStatus(status);

        return new Gson().toJson(basicPet);
    }
}