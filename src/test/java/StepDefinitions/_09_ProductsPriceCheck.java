package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Random;

public class _09_ProductsPriceCheck {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @When("user selects three random products")
    public void userSelectsThreeRandomProducts() {

        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            int randomDress = rand.nextInt(dc.allSummerDresses.size());
            dc.allSummerDresses.get(randomDress).click();
            dc.myClick(dc.addToCartButton);
            dc.myClick(dc.continueShoppingButton);
            GWD.getDriver().navigate().back();
        }
    }

    @And("user navigate to checkout from cart")
    public void userNavigateToCheckoutFromCart() {

        dc.myClick(ln.cartButton);
    }

    @Then("total price of the products should match with total products price")
    public void totalPriceOfTheProductsShouldMatchWithTotalProductsPrice() {

        double total = 0;
        for (WebElement all : dc.productsPrice) {
            double productsPrice = Double.parseDouble(all.getText().replaceAll("[^0-9.]", ""));
            total += productsPrice;
        }
        double totalPrice = Double.parseDouble(dc.totalPrice.getText().replaceAll("[^0-9.]", ""));
        Assert.assertEquals(total, totalPrice);
    }
}
