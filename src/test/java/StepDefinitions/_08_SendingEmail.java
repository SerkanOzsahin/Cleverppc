package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _08_SendingEmail {

    DialogContent dc = new DialogContent();

    @And("Click Contact Us button")
    public void clickContactUsButton() {

        dc.myClick(dc.ContactUS);
    }

    @Then("Select SubjectHeading,Order Reference")
    public void selectSubjectHeadingOrderReference() throws InterruptedException {

        Select SelectSub = new Select(dc.SubjectHeading);
        SelectSub.selectByValue("1");
        Select SelectOrd = new Select(dc.OrderRef);
        SelectOrd.selectByValue("87");
    }

    @And("Select Product and Send Massage")
    public void selectProductAndSendMassage() {

        Select SelectPro = new Select(dc.Product);
        SelectPro.selectByValue("1");
        dc.mySendKeys(dc.Message, "Banka havalesi henüz yapıldı, ödeme dekontu ektedir."
                + "İsim= Serkan Soyisim= Şengül.");
    }

    @Then("Click Attach File")
    public void clickAttachFile() {

        dc.myClick(dc.ChooseFile);
    }

    @And("Upload File with RobotClass")
    public void uploadFileWithRobotClass() throws AWTException, InterruptedException {

        Robot robot = new Robot();
        StringSelection dosyaYolu = new StringSelection("C:\\Users\\Serkan\\OneDrive\\Masaüstü\\DosyaGonderme.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);
        Thread.sleep(2);
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        Thread.sleep(2);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(2);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(2);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    @Then("Click Send Product")
    public void ClickSendProduct() {

        dc.myClick(dc.Send);
    }

    @And("Successfully sending")
    public void successfullySending() {

        dc.verifyContainsText(dc.Verify, "successfully");
        System.out.println("Mail gönderildi. =" + dc.Verify.getText());
    }
}
