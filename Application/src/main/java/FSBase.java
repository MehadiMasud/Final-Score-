import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FSBase extends Base {
    String signInLinkXpath = "//*[@id=\"app\"]/div/header/nav[1]/div/button";
    String userNameFieldXPath = ".c-form-field.c-form-field--email>label>input";
    String passwordFieldXpath = ".c-form-field.c-form-field--password>label>input";
    String signInButtonXpath = ".c-btn.c-btn--primary";

    public String userName = "footlockertesting@gmail.com";
    public String password = "Test@1234";


    public void fsLogin() throws InterruptedException {
        clickByXpath(signInLinkXpath);
        clickByCssSelectorAndSendKeys(userNameFieldXPath, userName);
        clickByCssSelectorAndSendKeys(passwordFieldXpath, password);
        clickByCssSelector(signInButtonXpath);
    }









//
//        driver.findElement(By.xpath(signInLinkXpath)).click();
//        Thread.sleep(4000);
//        driver.findElement(By.cssSelector(userNameFieldXPath)).sendKeys(userName);
//        Thread.sleep(4000);
//        driver.findElement(By.cssSelector(passwordFieldXpath)).sendKeys(password);
//        Thread.sleep(4000);
//        driver.findElement(By.cssSelector(signInButtonXpath)).click();
//        Thread.sleep(5000);





    public void fsLogin2() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("")).sendKeys("alam.write@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("")).sendKeys("Locker12");
        Thread.sleep(3000);
        driver.findElement(By.xpath("")).click();
        Thread.sleep(3000);



    }




}