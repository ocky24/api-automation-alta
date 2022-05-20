package Langkah;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class transaction {
    protected String url = "https://be-qa.alta.id/api";

    @Step("user GET api endpoint for see all transaction")
    public String userGetApiEndpointForSeeAllTransaction(){
        return url + "/orders";
    }

    @Step("user Send GET http request")
    public void userSendGetHttpRequest(){
        SerenityRest.given().get(userGetApiEndpointForSeeAllTransaction());
    }

    @Step("user receive response 401")
    public void userReceiveResponse401(){
        restAssuredThat(response -> response.statusCode(401));
    }

}
