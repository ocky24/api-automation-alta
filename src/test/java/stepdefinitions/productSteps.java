package stepdefinitions;

import Langkah.product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class productSteps {
    @Steps
    product product;

    @Given("user Post Api Endpoint to Create Product")
    public void userSetPostApiEndpointCreateProduct(){
    product.userPostApiEndpointCreateProduct();
    }

    @When("user Send Post HTTP Request")
    public void userSendPostHttpRequest(){
    product.userSendPostHttpRequest();
    }

}
