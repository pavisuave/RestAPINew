package stepDefinition;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

import org.json.simple.JSONObject;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;


public class RestAssuredTesting {
	String Baseurl="http://localhost:8081/";
	Response response;
	//Scenario scenario;
	
	public RestAssuredTesting() {
		// TODO Auto-generated constructor stub
	}
	//@Before
	//public void before(Scenario scenario) {
	//	this.scenario=scenario;
	//}

	@Given("Get call to {string}")
	public void get_call_to(String url) throws URISyntaxException{
	RestAssured.baseURI=Baseurl;		
	 RequestSpecification request=RestAssured.given();
	 response= request.when().get(new URI(url));
}
@Then("Response is {string}")
public void response_is(String status) {
	int actualResponseCode=response.then().extract().statusCode();
     assertEquals(status, actualResponseCode +"");
     System.out.println(status+" "+actualResponseCode);
}

	


}
