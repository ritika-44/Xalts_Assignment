package AppUtils;

import PageObjects.SignUpPage;
import common.Basetest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.time.Duration;

public class SignUpPageUtil extends Basetest {

    public void signUpFunction(String emailid,String password) throws InterruptedException {
        driver.findElement(signUpPage.getStartedbtn()).click();
        driver.findElement(signUpPage.emailTxt()).sendKeys(emailid);
        driver.findElement(signUpPage.passwordTxt()).sendKeys(password);
        driver.findElement(signUpPage.confirmPasswordtxt()).sendKeys(password);
        driver.findElement(signUpPage.signUpBtn()).click();
        Thread.sleep(3000);
        Assert.assertTrue(commonUtil.isDisplayed(signUpPage.captialNetworkTxt()));

    }
    public void signUpWithuseemail(String emailid,String password) throws InterruptedException {
        driver.findElement(signUpPage.getStartedbtn()).click();
        driver.findElement(signUpPage.emailTxt()).sendKeys(emailid);
        driver.findElement(signUpPage.passwordTxt()).sendKeys(password);
        driver.findElement(signUpPage.confirmPasswordtxt()).sendKeys(password);
        driver.findElement(signUpPage.signUpBtn()).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();

        String expectedresult = alert.getText();
        Assert.assertEquals("Provided E-Mail is already in use",expectedresult);
        alert.accept();
    }
}
