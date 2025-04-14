package CommonUtil;

import common.Basetest;
import org.openqa.selenium.By;

public class CommonUtil extends Basetest {
    public boolean isDisplayed( By locater){
        try {
            return driver.findElement(locater).isDisplayed();
        }
        catch(Exception e){
            return false;

        }
    }

}
