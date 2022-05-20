package Langkah;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class categories {
    protected String url = "https://be-qa.alta.id/api";

    @Step("User Get API EndPoint for categories")
    public String userGetApiEndpointForCategories(){return url + "/categories";}

    @Step("User send Get HTTP Request")
    public void userSendGetHttpRequest(){
        SerenityRest.given().get(userGetApiEndpointForCategories());
    }

    @Step("validate ID and name")
    public void validateIdAndName(){
        Response response = SerenityRest.lastResponse();
        int ID = response.getBody().jsonPath().get("data.ID[0]");
        String Name = response.getBody().jsonPath().get("data.Name[0]");
        Assert.assertEquals(ID,1 );
        Assert.assertEquals(Name,"kesehatan" );
    }



}
