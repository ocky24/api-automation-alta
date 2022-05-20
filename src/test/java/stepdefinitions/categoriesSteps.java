package stepdefinitions;

import Langkah.categories;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class categoriesSteps {
    @Steps
    categories kategori;

    @Given("User Get API EndPoint for categories")
    public void userGetApiEndpointForCategories(){
    kategori.userGetApiEndpointForCategories();
    }

    @When("User send Get HTTP Request")
    public void userGetHttpRequest(){
    kategori.userSendGetHttpRequest();
    }

    @And ("validate ID and name")
    public void ValidateIdAndName(){
    kategori.validateIdAndName();
    }



}
