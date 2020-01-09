package base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseApiTest {

    protected RequestSpecification getRequestSpec() {
        return new RequestSpecBuilder()
                .addCookie("token", "FGHsdfkhdkjf123")
                .addHeader("header1", "value1")
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.ANY)
                .build();
    }

    protected ResponseSpecification getResponseSpec() {
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectStatusLine("Status OK")
                .build();
    }

    /*RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder()
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.JSON)
            .setBaseUri(getCredentialsProperty().getHost())
            .setBasePath(getVsaApiCredentialsProperty().getVsaApiBasePath())
            .addFilter(new AllureRestAssured())
            .build();*/

   /* new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();*/
}
