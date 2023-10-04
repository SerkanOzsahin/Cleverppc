package StepDefinitions;

import Pages.DialogContent;
import Pages.NavTab;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class _10_SearchNull {

    NavTab ln = new NavTab();
    DialogContent dc = new DialogContent();

    @When("user search with null")
    public void userSearchWithNull() {

        ln.mySendKeys(ln.search, "" + Keys.ENTER);
    }

    @Then("warning message should be displayed")
    public void warningMessageShouldBeDisplayed() {

        dc.verifyContainsText(dc.alertText, "keyword");
    }
}
