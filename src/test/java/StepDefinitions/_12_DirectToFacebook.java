package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Set;

public class _12_DirectToFacebook {

    DialogContent dc = new DialogContent();

    @When("user clicks on the facebook link")
    public void userClicksOnTheFacebookLink() {
        dc.myClick(dc.backToMainPage);
        dc.scrollToElement(dc.facebookBlock);
        dc.myClick(dc.facebookLink);
    }

    @Then("user should be directed to facebook website")
    public void userShouldBeDirectedToFacebookWebsite() throws InterruptedException {

        Thread.sleep(2000);
        Set<String> windowHandles = GWD.getDriver().getWindowHandles();
        for (String w : windowHandles) {
            GWD.getDriver().switchTo().window(w);
            if (GWD.getDriver().getCurrentUrl().toLowerCase().contains("facebook")) {
                Assert.assertTrue(GWD.getDriver().getCurrentUrl().toLowerCase().contains("facebook"));
            }
        }
    }
}
