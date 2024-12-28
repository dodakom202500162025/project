package Pages.SignupPage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Signup {
    private static WebDriver driver;

    public Signup(WebDriver driver) {
        Signup.driver = driver;
    }
//locators

    By signUpBtn = By.xpath("//a[text()='Sign up']");


    By UserName = By.id("sign-username");

    By Password = By.id("sign-password");
    //
    By SignupButton = By.xpath("//button[text()='Sign up']");

    //methods

    public void openSignupPage() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(signUpBtn));
        element.click();
    }


    public void setUserName(String userName) {
        driver.findElement(UserName).sendKeys(userName);

    }

    public void setPassword(String password) {
        driver.findElement(Password).sendKeys(password);

    }

    public void setSignupButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(SignupButton));
        element.click();
    }

        public void setSignupMsg(){
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
            Alert alert = wait1.until(ExpectedConditions.alertIsPresent());
            String alertText = alert.getText();
            Assert.assertEquals(alertText, "Sign up successful.", "user already exist");
            alert.accept();
            System.out.println(alertText);
        }

}
