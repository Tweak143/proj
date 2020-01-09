package apitest;

import base.BaseApiTest;
import io.restassured.authentication.OAuthSignature;
import io.restassured.http.ContentType;
import model.Address;
import model.RequestObject;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class APITestExample extends BaseApiTest {

    @Test
    public void apiExample() {
        Address address = new Address("Minsk", "Street", 123);
        RequestObject toSend = RequestObject.builder()
                .address(Address.builder()
                        .city("Minsk")
                        .street("Kyibisheva")
                        .index(12345)
                        .build())
                .firstName("Ivan")
                .lastName("Ivanov")
                .build();
        String response = given()
                .spec(getRequestSpec())
                .auth().oauth2("Strsdfsdf", OAuthSignature.HEADER)// doesn't work
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .baseUri("https://postman-echo.com")
                .body(toSend)
                .post("/post")
                .then()
                .spec(getResponseSpec())
                .statusCode(200)
                .body("data.firstName", Matchers.equalTo(toSend.getFirstName()))
                .extract()
                .asString();
        System.out.println(response);
    }

    @Test
    public void getTest() {
        Map<String, Object> params = new HashMap<>();
        params.put("lastName", "Doe");
        params.put("age", 45);
        RequestObject response = given()
                .accept(ContentType.ANY)
                .baseUri("https://postman-echo.com")
                .param("name", "John")
                .params(params)
                .get("/get")
                .then()
                .statusCode(200)
                .extract()
                .as(RequestObject.class);
        System.out.println(response);
    }
}
