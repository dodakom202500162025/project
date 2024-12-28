package Pages.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Login {
    private static WebDriver driver;

    public Login(WebDriver driver) {
        Login.driver= driver;
    }


    //locator

    By LoginButtonHeader = By.xpath("//a[text()='Log in']");

    By Usernamelogin = By.xpath("//input[@id='loginusername']");

    By PasswordLogin = By.xpath("//input[@id='loginpassword']");

    By LoginButton = By.xpath("//Button[text()='Log in']");

    By AssertMsg = By.xpath("//a[text()='Welcome Haidyfads1@213']");


//METHODS
 public void setLoginButtonHeader() {
     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
     WebElement element = wait.until(ExpectedConditions.elementToBeClickable(LoginButtonHeader));
     element.click();


    }

public void setUsernamelogin(String usernamelogin){
        driver.findElement(Usernamelogin).sendKeys(usernamelogin);
}

public void setPasswordLogin(String passwordLogin){
        driver.findElement(PasswordLogin).sendKeys(passwordLogin);
}

public void setLoginButton()  {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
    element.click();
}

public void AsserMessage(){
     String msg = driver.findElement(AssertMsg).getText();
    Assert.assertEquals(msg,"Welcome Haidyfads1@213");
    System.out.println(msg);
}
}