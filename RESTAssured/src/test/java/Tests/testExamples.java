package Tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class testExamples {
	@Test
	public void test_1() {

		Response rp = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(rp.getStatusCode());
		System.out.println(rp.statusLine().toString());
		System.out.println(rp.asPrettyString());
		
		
	}

	@Test
	public void test_2() {
		given().get("https://reqres.in/api/users?page=2");
		
	}
}
