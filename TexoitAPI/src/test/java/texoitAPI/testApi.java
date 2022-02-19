package texoitAPI;

	import static io.restassured.RestAssured.given;
	import static org.hamcrest.Matchers.containsString;

	import org.junit.Test;

	import io.restassured.RestAssured;

	public class testApi {
		
		@Test
		public void validarEmail() {
		RestAssured.given()
			
			
			
			.when()
			.get("https://jsonplaceholder.typicode.com/comments")
			
			.then()
			
			.statusCode(200)
			.body(containsString("Lew@alysha.tv"));
			
	}
		@Test	
		public void Cadastro() {		
					
		
			given()
		    .contentType("application/json").body("{\r\n" + 
		    		"    \"albumId\": 5,\r\n" + 
		    		"    \"id\": 6,\r\n" + 
		    		"    \"title\": \"teste Api Texoit\",\r\n" + 
		    		"    \"url\": \"https://via.placeholder.com/600/56a8c2\",\r\n" + 
		    		"    \"thumbnailUrl\": \"https://via.placeholder.com/150/56a8c2\"\r\n" + 
		    		"  }")
			
			
			.when()
			.post("https://jsonplaceholder.typicode.com/users")
			.then()
			.log().all()
		     .statusCode(201)
			.body(containsString("teste Api Texoit"));
			   
			   
		
			   
		}

	}


