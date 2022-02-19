package projeto.api;
import static org.hamcrest.Matchers.is;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Actions {


	public static Response response;
    public static RequestSpecification requestAPI;
    public static String respJson;
    public static int statusCode;
    public static String mensagemEsperada;
    public static String marca;
    
    
    public static void urlAcesso(String url) {
            RestAssured.baseURI = url;
            requestAPI = RestAssured.given();
    }

    public static Response metodoGet() {
        response = requestAPI.get(RestAssured.baseURI);
        statusCode = response.getStatusCode();
        respJson = response.getBody().prettyPrint();
        return response;
        
    }

    public static void validoStatusCode(int statusCodeEsperado){
        Assert.assertEquals("Resultado retornou statuscode diferente do esperado. ",statusCodeEsperado, statusCode); 	
       
    }
    public static void validaEmail(String nameEsperado) {
    	requestAPI.log().all().when().get("https://jsonplaceholder.typicode.com/comments")
    	.then().log().all().extract().response();
    	Assert.assertEquals(nameEsperado, is("email"));
    	
}
    }
    

