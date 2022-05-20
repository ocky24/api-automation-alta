package Langkah;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class rating {
    protected String url = "https://be-qa.alta.id/api";

    @Step("user get api endpoint for product rating")
    public String userGetApiEndpointForProductRating(){
        return url + "/products/8/ratings";
    }

    @Step("user send get http request")
    public void userSendGetHttpRequest(){
        SerenityRest.given().get(userGetApiEndpointForProductRating());
    }

    @Step("validate rating")
    public void validateRating(){
        Response response = SerenityRest.lastResponse();
        int data = response.getBody().jsonPath().get("data");
        Assert.assertEquals(data,2 );
    }
}
