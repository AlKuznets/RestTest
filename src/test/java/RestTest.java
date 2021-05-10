import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class RestTest {

    @Test
    public void getUsers(){
        given()
                .baseUri("https://api.nasa.gov/planetary/apod?api_key=GAALaPSNtLGduRozfooCNXYpNfdVDP7uMcw63WMx")
                .basePath("/apod/astropix.html")
                .contentType(ContentType.HTML)
                .when().get()
                .then().statusCode(200);
    }
}
