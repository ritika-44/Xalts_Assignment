package AppUtils;

import common.Basetest;

public class SignOutpageUtil extends Basetest {
    //Signout from SignIn fuctionality
    public void signOutFunctionalitySignIn(String emailid, String password){
        signInPageUtil.signInFunction(emailid,password);
        driver.findElement(signOutPage.signOutBtn()).click();
    }
    //Signout from signup functionality
    public void signOutFuctionality(String emailid, String password) throws InterruptedException {
        sigupPageUtil.signUpFunction(emailid,password);
        driver.findElement(signOutPage.signOutBtn()).click();

    }


}
