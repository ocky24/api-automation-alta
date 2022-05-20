package stepdefinitions;

import Langkah.login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class loginSteps {
    @Steps
    login Loginn;

    @Given("user Post API endpoint")
    public void setPostApiEndpoints(){
    Loginn.setPostApiEndpoints();
    }

    @When("user send POST HTTP request")
    public void sendPostHTTPrequest(){
    Loginn.sendPostHTTPrequest();
    }

    @Then("user receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode200() {
        Loginn.receiveValidHttpResponseCode200();
    }

    @When("user send POST HTTP request Invalid Password")
    public void PostHttpRequestInvalidPassword(){
        Loginn.sendPostHttpRequestInvalidPassword();
    }

    @Then("user receive HTTP response code 400")
    public void receiveHttpResponse400(){
        Loginn.receiveHttpResponse400();
    }
}
