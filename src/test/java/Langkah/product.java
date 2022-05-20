package Langkah;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class product {
    protected String url = "https://be-qa.alta.id/api";

    @Step("user Post Api Endpoint to Create Product")
    public String userPostApiEndpointCreateProduct(){
        return url + "/products";
    }

    @Step("user Send Post HTTP Request")
    public void userSendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","Tensi Darah Elektrik");
        requestBody.put("price",240000);
        requestBody.put("categories.[0]",3);
        requestBody.put("categories.[1]",6);
        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(userPostApiEndpointCreateProduct());
    }

}
