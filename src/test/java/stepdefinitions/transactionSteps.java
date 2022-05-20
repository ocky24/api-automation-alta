package stepdefinitions;

import Langkah.transaction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class transactionSteps {
    @Steps
    transaction transaksi;

    @Given("user GET api endpoint for see all transaction")
    public void userGetApiEndpointForSeeAllTransaction(){
    transaksi.userGetApiEndpointForSeeAllTransaction();
    }

    @When("user Send GET http request")
    public void userSendGetHttpRequest(){
    transaksi.userSendGetHttpRequest();
    }

    @Then("user receive response 401")
    public void userReceiveRepsponse401(){
    transaksi.userReceiveResponse401();
    }

}
