package PageObjects;

import common.Basetest;
import org.openqa.selenium.By;

public class SignInPage extends Basetest {
    public By accountBtn(){
        return By.xpath("//button[text()='Already have an account? Click here to sign in.']");
    }
    public  By signInBtn(){
        return By.xpath("//button[text()='Sign In']");
    }
}
