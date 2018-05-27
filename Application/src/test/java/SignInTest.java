import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends FSBase {

    @Test
    public void testFSSignIn() throws InterruptedException {
        fsLogin();
        //Assert.assertEquals(driver.getTitle(), "Message Inbox | Secure Message Center");

    }

//    @Test
//    public void myTestCase2() {
//
//        // test step 1
//        // test step 2
//        // test step 3
//        // test step 4
//
//    }
//
//    @Test
//    public void myTestCase4() {
//
//        // test step 1
//        // test step 2
//        // test step 3
//        // test step 4
//    }


}