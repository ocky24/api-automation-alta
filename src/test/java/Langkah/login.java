package Langkah;

import net.serenitybdd.rest.SerenityRest;
import org.json.simple.JSONObject;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class login {
    protected String url = "https://be-qa.alta.id/api";

    @Step("user Post API endpoint")
    public String setPostApiEndpoints(){return url + "/auth/login";}

    @Step("user send POST HTTP request")
    public void sendPostHTTPrequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","alexunder@email.com");
        requestBody.put("password","123123123");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setPostApiEndpoints());
    }

    @Step("user send POST HTTP request Invalid Password")
    public void sendPostHttpRequestInvalidPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","alexunder@email.com");
        requestBody.put("password","098765");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(setPostApiEndpoints());
    }

    @Step("user receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user receive HTTP response code 400")
    public void receiveHttpResponse400(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
