package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class _07_OrderingAndPayment {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @When("User clicks on cart and Checkout button")
    public void userClicksOnCartAndCheckoutButton() {

        ln.myClick(ln.dresBtn);
        dc.myClick(dc.addToBtn);
        dc.myClick(dc.addToCartBtn);
        dc.myClick(dc.checkoutBtn);
    }

    @Then("User selects an adress")
    public void userSelectsAnAdress() {

        dc.myClick(dc.checkoutBtn2);
        dc.myClick(dc.checkoutBtn3);
    }

    @And("User select shipment method and terms of service")
    public void userSelectShipmentMethodAndTermsOfService() {

        dc.checkBoxBtn.sendKeys(Keys.SPACE);
    }

    @Then("User selects proceed to checkout")
    public void userSelectsProceedToCheckout() {

        dc.myClick(dc.checkoutBtn4);
    }

    @And("User selects pay with paypal and warning message should be displayed")
    public void userSelectsPayWithPaypalAndWarningMessageShouldBeDisplayed() {

        dc.myClick(dc.paypalBtn);
        Assert.assertTrue(dc.paypalErrorMsg.getText().contains("tekrar deneyin"));
        GWD.getDriver().navigate().back();
    }

    @Then("User navigate back and click on pay with card and warning message should be displayed")
    public void userNavigateBackAndClickOnPayWithCardAndWarningMessageShouldBeDisplayed() {

        dc.myClick(dc.creditCartBtn);
        Assert.assertTrue(dc.creditCartErrorMsg.getText().contains("Invalid request"));
        GWD.getDriver().navigate().back();
    }

    @And("User navigate back and click on pay with bank")
    public void userNavigateBackAndClickOnPayWithBank() {

        dc.myClick(dc.bankCartBtn);
    }

    @Then("User see total price is equals to shipping price and taxes")
    public void userSeeTotalPriceIsEqualsToShippingPriceAndTaxes() {

        double productsPrice = Double.parseDouble(dc.total1.getText().replaceAll("[^0-9.]", ""));
        dc.myClick(dc.checkoutBtn5);
        double productsPrice2 = Double.parseDouble(dc.total2.getText().replaceAll("[^0-9.]", ""));
        Assert.assertTrue(productsPrice == productsPrice2);
    }

    @And("Order number can be saved")
    public void orderNumberCanBeSaved() {

        Assert.assertTrue(dc.message.getText().contains("complete"));
        dc.myClick(dc.orderHistory);
        System.out.println("Your bank order number= " + dc.orderMessage.getText());
    }
}
