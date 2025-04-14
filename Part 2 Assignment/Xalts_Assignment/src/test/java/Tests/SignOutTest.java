package Tests;

import common.Basetest;
import org.testng.annotations.Test;

public class SignOutTest extends Basetest{
    //Signout Fuctionality after signIn to the website
    @Test
    public void signOutAfterSignIn(){
        signOutpageUtil.signOutFunctionalitySignIn("ritikazalke@gmail.com","Ritika@2349");
    }
    //SignOut Functionality after signup to the website
    @Test
    public void signOutAfterSinUp() throws InterruptedException {
        signOutpageUtil.signOutFuctionality("test9@gmail.com","Test@2345");
    }
}
