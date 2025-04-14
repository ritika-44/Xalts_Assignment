package PageObjects;

import common.Basetest;
import org.openqa.selenium.By;

public class SignOutPage extends Basetest {
    public By signOutBtn(){
        return By.xpath("//button[text()='Sign Out']");
    }
}
