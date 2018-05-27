import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends FSBase {

    @Test
    public void testLandingPage() throws Exception {

        waitSometime(5000);
        String title = driver.getTitle();

        Assert.assertEquals(title, "Final-Score");



    }

}