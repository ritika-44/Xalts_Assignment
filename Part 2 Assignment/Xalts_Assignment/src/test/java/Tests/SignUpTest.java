package Tests;

import common.Basetest;
import org.testng.annotations.Test;

public class SignUpTest extends Basetest {
    //Verify correct SignUp Functionality
    @Test
    public void correctCeredentialsSignUp() throws InterruptedException {
        sigupPageUtil.signUpFunction("test125be@gmail.com","Ritika@2349");

    }
    @Test
    //Verify emailid
    public void samecerendialSignUp() throws InterruptedException {
        sigupPageUtil.signUpWithuseemail("test123be@gmail.com","Ritika@2349");
    }

}
