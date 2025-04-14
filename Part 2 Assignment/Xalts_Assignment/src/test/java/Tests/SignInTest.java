package Tests;

import common.Basetest;
import org.testng.annotations.Test;

public class SignInTest extends Basetest {
    //Verify with correct emailid and password
    @Test
    public void correctCeredentials(){
        signInPageUtil.signInFunction("ritikazalke@gmail.com","Ritika@2349");
    }
    //LOGIN with incorrectemail
    @Test
    public void incorrectemail(){
        signInPageUtil.signInWithIncorrectEmail("ritoka@gamil.com","Ritika@2349");
    }
    @Test
    public void incorrectPassword(){
        signInPageUtil.signInWithIncorrectPasswordl("ritikazalke@gmail.com","Ritika@55");
    }

}
