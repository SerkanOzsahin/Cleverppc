package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _03_NewAddress {

    DialogContent dc = new DialogContent();

    @When("user clicks on the sitemap link and directed to the sitemap page")
    public void userClicksOnTheSitemapLinkAndDirectedToTheSitemapPage() {

        dc.myClick(dc.sitemapButton);
        dc.verifyContainsText(dc.sitemapText, "SITEMAP");
    }

    @Then("user clicks on the address link and directed to the address page")
    public void userClicksOnTheAddressLinkAndDirectedToTheAddressPage() {

        dc.myClick(dc.addressButton);
        dc.verifyContainsText(dc.addressText, "MY ADDRESSES");
    }

    @And("user clicks on the add a new address button")
    public void userClicksOnTheAddANewAddressButton() {

        dc.myClick(dc.newAddressButton);
    }

    @Then("user fills all required fields")
    public void userFillsAllRequiredFields(DataTable dt) {

        Select ddMenu = new Select(dc.state);
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement e = dc.ElementGet(items.get(i).get(0));
            dc.mySendKeys(e, items.get(i).get(1));
        }
        ddMenu.selectByIndex(5);
        dc.myClick(dc.saveButton);
    }

    @And("address should be successfully added")
    public void addressShouldBeSuccessfullyAdded() {

        dc.verifyContainsText(dc.addressConfirm, "MY ADDRESS2");
        dc.myClick(dc.deleteSecondAddress);
        GWD.getDriver().switchTo().alert().accept();
    }
}
