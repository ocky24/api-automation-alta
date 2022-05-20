package stepdefinitions;

import Langkah.rating;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ratingSteps {
    @Steps
    rating rating;

    @Given("user get api endpoint for product rating")
    public void userGetApiEndpointForProductRating(){
    rating.userGetApiEndpointForProductRating();
    }

    @When("user send get http request")
    public void userSendGetHttpRequest(){
    rating.userSendGetHttpRequest();
    }
    @And("validate rating")
    public void validateRating(){
    rating.validateRating();
    }




}
