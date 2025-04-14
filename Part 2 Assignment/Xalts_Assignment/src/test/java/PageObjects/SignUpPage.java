package PageObjects;

import common.Basetest;
import org.openqa.selenium.By;

public class SignUpPage extends Basetest {

    public By getStartedbtn(){
        return By.xpath("//button[contains(@class,'MuiButtonBase-root ')][text()=\"Get Started\"]");

    }

    public By emailTxt(){

        return By.xpath("//label[text()='E-Mail']/following-sibling::div//input");
    }
    public By passwordTxt(){

        return By.xpath("//label[text()='Password']/following-sibling::div//input");
    }
    public By confirmPasswordtxt(){
        return By.xpath("//label[text()='Confirm Password']/following-sibling::div//input");
    }
    public By signUpBtn(){

        return By.xpath("//button[text()='Sign Up']");
    }
    public By captialNetworkTxt(){

        return By.xpath("//h1[text()='Open Capital Network']");
    }


}
