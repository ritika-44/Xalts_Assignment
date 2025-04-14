package common;


import AppUtils.DashBoardPageUtil;
import AppUtils.SignInPageUtil;
import AppUtils.SignOutpageUtil;
import AppUtils.SignUpPageUtil;
import CommonUtil.CommonUtil;
import PageObjects.DashBoardPage;
import PageObjects.SignInPage;
import PageObjects.SignOutPage;
import PageObjects.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Basetest {

    protected static WebDriver driver;
    protected static SignUpPage signUpPage = new SignUpPage();
    protected static SignUpPageUtil sigupPageUtil = new SignUpPageUtil();
    protected static SignInPage signInPage =new SignInPage();
    protected static SignInPageUtil signInPageUtil = new SignInPageUtil();
    protected static SignOutPage signOutPage = new SignOutPage();
    protected static SignOutpageUtil signOutpageUtil = new SignOutpageUtil();
    protected static DashBoardPage dashBoardPage = new DashBoardPage();
    protected static DashBoardPageUtil dashBoardPageUtil = new DashBoardPageUtil();
    protected static CommonUtil commonUtil = new CommonUtil();
    @BeforeMethod
    public void setup() {
        // Set the path to the EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "src/test/resources/msedgedriver.exe");

        // Initialize the EdgeDriver
        driver = new EdgeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Implicit wait for 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Navigate to the default URL (You can change this as needed)
        driver.get("https://xaltsocnportal.web.app/");

    }
    @AfterMethod
    public void teardown() {
        // Close the browser after test execution
        if (driver != null) {
            driver.quit();
        }

    }
}

