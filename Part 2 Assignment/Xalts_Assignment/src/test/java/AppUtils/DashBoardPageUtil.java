package AppUtils;

import common.Basetest;

public class DashBoardPageUtil extends Basetest {
    public void SubmitRequest(String emailid,String password,String nodeid,String publicip){
        signInPageUtil.signInFunction(emailid , password);
        driver.findElement(dashBoardPage.onboardOCNNodebtn()).click();
        driver.findElement(dashBoardPage.nodeIdTxt()).sendKeys(nodeid);
        driver.findElement(dashBoardPage.publicIp()).sendKeys(publicip);
        driver.findElement(dashBoardPage.addNodeBtn()).click();
        driver.findElement(dashBoardPage.nxtBtn()).click();
        driver.findElement(dashBoardPage.walletTxt()).sendKeys("0x88fa61d2faA13aad8Fbd5B030372B4A159BbbDFb");
        driver.findElement(dashBoardPage.addWalletbtn()).click();
        driver.findElement(dashBoardPage.nxtBtn()).click();
        driver.findElement(dashBoardPage.submitbtn()).click();
    }
    public void NewPrivateBlockchain(String emailid,String password,String nodeid,String publicip){
        signInPageUtil.signInFunction(emailid , password);
        driver.findElement(dashBoardPage.launchocnbtn()).click();
        driver.findElement(dashBoardPage.networkTxt()).sendKeys("Test");
        driver.findElement(dashBoardPage.walletTxt()).sendKeys("0x88fa61d2faA13aad8Fbd5B030372B4A159BbbDFb");
        driver.findElement(dashBoardPage.nxtBtn()).click();
        driver.findElement(dashBoardPage.nodeIdTxt()).sendKeys(nodeid);
        driver.findElement(dashBoardPage.publicIp()).sendKeys(publicip);
        driver.findElement(dashBoardPage.addNodeBtn()).click();
        driver.findElement(dashBoardPage.nxtBtn()).click();
        driver.findElement(dashBoardPage.submitbtn()).click();
    }

}
