package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(

        tags = "",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class TestRunnerALL extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() {

        ExtentService.getInstance().setSystemInfo("Windows User Name", System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("User Name", "Group 3 ");
        ExtentService.getInstance().setSystemInfo("Application Name", "https://cleverppc.com/prestashop4/");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("İrem Torun= ", " User Story(6)");
        ExtentService.getInstance().setSystemInfo("Nurhayat Soydan= ", "User Story(7)");
        ExtentService.getInstance().setSystemInfo("Serkan Özşahin= ", "User Stories(3-4-5-9-10-11-12");
        ExtentService.getInstance().setSystemInfo("Serkan Şengül= ", "User Stories(1-2-8-13");
    }
}
