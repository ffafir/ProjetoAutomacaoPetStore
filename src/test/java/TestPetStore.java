import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.equalTo;


public class TestPetStore {
    String url = "https://petstore.swagger.io/#/pet/getPetById";

    @Test
    public void validarGetFindByStatus(){
        given().
                param("9223372036854648000").
                when().
                    get(url).
                then().statusCode(200);


    }
}
