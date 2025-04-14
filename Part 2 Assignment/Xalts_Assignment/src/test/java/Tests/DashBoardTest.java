package Tests;

import common.Basetest;
import org.testng.annotations.Test;

public class DashBoardTest extends Basetest {
    //Submit Request To Onboard Nodes to Existing Blockchain
    @Test
    public void existingBlockchainFunctioanlity(){
        dashBoardPageUtil.SubmitRequest("ritikazalke@gmail.com","Ritika@2349","NodeID-34","5.4.4.4");
    }
    //Submit Request To Create New Private Blockchain
    @Test
    public void privateBlockChainFunctionality(){
        dashBoardPageUtil.NewPrivateBlockchain("ritikazalke@gmail.com","Ritika@2349","NodeID-34","5.4.4.4");
    }

}
