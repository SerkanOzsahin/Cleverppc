package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_AddingProductstoCart {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @Given("navigate to summer dresses")
    public void navigateToSummerDresses() {

        Actions actions = new Actions(GWD.getDriver());
        Action aksiyon = actions.moveToElement(ln.womenButton).build();
        aksiyon.perform();
        ln.myClick(ln.summerDressesButton);
    }

    @When("user selects a random product")
    public void userSelectsARandomProduct() {

        int randomDress = (int) (Math.random() * dc.allSummerDresses.size());
        dc.allSummerDresses.get(randomDress).click();
    }

    @Then("user clicks on the add to cart button")
    public void userClicksOnTheAddToCartButton() {

        dc.myClick(dc.addToCartButton);
    }

    @And("product should be successfully added to the cart")
    public void productShouldBeSuccessfullyAddedToTheCart() {

        dc.verifyContainsText(dc.confirmText, "successfully");
    }
}
