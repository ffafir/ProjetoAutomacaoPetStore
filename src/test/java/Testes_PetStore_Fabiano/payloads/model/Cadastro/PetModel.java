package Testes_PetStore_Fabiano.payloads.model.Cadastro;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PetModel {
    private int id;
    CategoryModel CategoryObject;
    private String name;
    public Tags[] tags;
    public PhotoURLs[] photoURLs;
    /*ArrayList<Object> photoUrls = new ArrayList<Object>();
    ArrayList<Object> tags = new ArrayList<Object>();*/
    private String status;


    // Getter Methods

    public float getId() {
        return id;
    }

    public CategoryModel getCategory() {
        return CategoryObject;
    }

    public String getName() {
        return name;
    }
    public Tags[] getTags() {
        return tags;
    }
    public PhotoURLs[] getPhotosURLs() {
        return photoURLs;
    }
    public String getStatus() {
        return status;
    }

    // Setter Methods

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(CategoryModel categoryObject) {
        this.CategoryObject = categoryObject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTags(Tags[] tags) {
        this.tags = tags;
    }

    public void setPhotoURLs(PhotoURLs[] photoURLs) {
        this.photoURLs = photoURLs;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public class CategoryModel {
        private float id;
        private String name;
        // Getter Methods
        public float getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        // Setter Methods
        public void setId(float id) {
            this.id = id;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    public class Tags {
        private float idTags;
        private String nameTags;

        //Getter
        public float getIdTags(){
            return idTags;
        }
        public String getNameTags(){
            return nameTags;
        }

        //Setter
        public void setIdTags(float id){
            this.idTags = id;
        }
        public  void setNameTags(String name){
            this.nameTags = name;
        }
    }

    public class PhotoURLs {
        private String photosUrl;

        //Getter
        public String getPhotosUrl(){
            return photosUrl;
        }

        //Setter
        public  void setNameTags(String photosUrl){
            this.photosUrl = photosUrl;
        }
    }

    public PetModel(int id,
                    String nome,
                    String status) {
        this.id = id;
        this.name = nome;
        this.status = status;
    }
}
