package PageObjects;

import common.Basetest;
import org.openqa.selenium.By;

public class DashBoardPage extends Basetest {
    public By onboardOCNNodebtn(){
        return By.xpath("//div[@class='getting-started-option']//h2[text()='Onboard OCN Node']");
    }
    public By nodeIdTxt(){
        return By.xpath("//label[text()='Node ID']//following-sibling::div//input");
    }
    public By publicIp(){
        return By.xpath("//label[text()='Public IP']//following-sibling::div//input");
    }
    public By addNodeBtn(){
        return By.xpath("//button[text()='+ Add Node ']");
    }
    public By nxtBtn(){
        return By.xpath("//button[text()='Next']");
    }
    public By walletTxt(){
        return By.xpath("//label[text()='Wallet Address']//following-sibling::div//input");
    }
    public By addWalletbtn(){
        return By.xpath("//button[text()=' + Add Wallet ']");
    }
    public By submitbtn(){
        return By.xpath("//button[text()='Submit']");
    }
    public By launchocnbtn(){
        return By.xpath("//div[@class='getting-started-option']//h2[text()='Launch OCN Child Network']");
    }
    public By networkTxt(){
        return By.xpath("//label[text()='Network Name']//following-sibling::div//input");
    }

}
