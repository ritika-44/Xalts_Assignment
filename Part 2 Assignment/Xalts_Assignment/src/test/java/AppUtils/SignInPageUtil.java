package AppUtils;

import common.Basetest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SignInPageUtil extends Basetest {

    public void signInFunction(String emailid,String password){
        driver.findElement(signUpPage.getStartedbtn());
        driver.findElement(signInPage.accountBtn()).click();
        driver.findElement(signUpPage.emailTxt()).sendKeys(emailid);
        driver.findElement(signUpPage.passwordTxt()).sendKeys(password);
        driver.findElement(signInPage.signInBtn());
        Assert.assertTrue(commonUtil.isDisplayed(signUpPage.captialNetworkTxt()));
    }
    public void signInWithIncorrectEmail(String emailid,String password){
        signInFunction(emailid,password);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String expectedresult = alert.getText();
        Assert.assertEquals("User not found",expectedresult);
        alert.accept();
    }
    public void signInWithIncorrectPasswordl(String emailid,String password){
        signInFunction(emailid,password);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String expectedresult = alert.getText();
        Assert.assertEquals("Incorrect E-Mail or Password",expectedresult);
        alert.accept();
    }

}
