package Pages.AddPoducts;

import TestData.Configurations;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddProducts {

    private static WebDriver driver;

    public AddProducts(WebDriver driver) {
        AddProducts.driver = driver;
    }

    //locator

    By HomePage = By.xpath("//a[@class='nav-link']");

    By LaptopsCat = By.xpath("//a[text()='Laptops']");

    By Product1 = By.xpath("//a[text()='Sony vaio i5']");

    By AddToCart1 = By.xpath("//a[text()='Add to cart']");

    By product2 = By.xpath("//a[text()='Dell i7 8gb']");

    By CartButton = By.xpath("//a[text()='Cart']");

    By title = By.xpath("//th[text()='Title']");

    By price = By.xpath("//th[text()='Price']");

    By TitleDisplay = By.xpath("//td[text()='Sony vaio i5']");

    By PriceDisplay = By.xpath("//td[text()='790']");

    By pOrder = By.xpath("//button[text()='Place Order']");

    By TotalPRICE = By.xpath("(//label[@class='form-control-label'])[7]");

    By name = By.xpath("//input[@id='name']");


    By country = By.xpath("//input[@id='country']");


    By city = By.xpath("//input[@id='city']");


    By card = By.xpath("//input[@id='card']");


    By month = By.xpath("//input[@id='month']");

    By year = By.xpath("//input[@id='year']");


    By purchase = By.xpath("//button[text()='Purchase']");

    By MSG = By.xpath("//h2[text()='Thank you for your purchase!']");


//MethodsB

    public void setHomePage() {
        driver.findElement(HomePage).click();
    }

    public void setLaptopsCat() {
        driver.findElement(LaptopsCat).click();
    }


    //    public void add2products() throws InterruptedException {
//        for (int i = 1; i <= 2; i++) {
//            Thread.sleep(1000);
////            Actions a = new Actions(driver);
////            a.moveToElement(driver.findElement(By.xpath("//div[@class='card-block']//a")));
//            driver.findElement(By.xpath("(//div[@class='card-block']//a)" + "[" + i + "]")).click();
//            driver.findElement(AddToCart1).click();
//            Thread.sleep(1000);
//            Alert alert = driver.switchTo().alert();
//            alert.accept();
//            driver.navigate().back();
//            Thread.sleep(1000);
//
//        }
//    }
    public void setProduct1() {
        driver.findElement(Product1).click();
    }


    public void setAddToCart() {
        driver.findElement(AddToCart1).click();
    }

//    public static void setDriver(WebDriver driver) {
//        driver.navigate().back();
//    }

    public void confirmMsg() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String msg = alert.getText();
        Assert.assertEquals(msg, "Product added");
        alert.accept();
        System.out.println(msg);

    }

    public void setDriver() {
        driver.navigate().to(Configurations.url2);

    }

    public void setLaptopsCat1() {
        driver.findElement(LaptopsCat).click();
    }

    public void setProduct2() {
        driver.findElement(product2).click();
    }


    public void setAddToCart2() {
        driver.findElement(AddToCart1).click();
    }

    public void confirmMsg2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String msg = alert.getText();
        Assert.assertEquals(msg, "Product added");
        alert.accept();
        System.out.println(msg);

    }

    public void setCartButton() {
        driver.findElement(CartButton).click();
    }

    public void setTitle() {
        driver.findElement(title).getText();
    }

    public void setPrice() {
          driver.findElement(price).getText();

    }

    public void setTitleDisplay() {
        String titlename = driver.findElement(TitleDisplay).getText();
        Assert.assertEquals(titlename, "Sony vaio i5");
        System.out.println(titlename);
    }

    public void setPriceDisplay() {
        String Pricetext = driver.findElement(PriceDisplay).getText();
        Assert.assertEquals(Pricetext, "790");
        System.out.println(Pricetext);
    }

    public void setpOrder() {
        driver.findElement(pOrder).click();
    }


    public void setTotalPRICE() throws InterruptedException {
        Thread.sleep(3000);
      String TP = driver.findElement(TotalPRICE).getText();
        System.out.println(TP);
    }

    public void setName(String Name) {
        driver.findElement(name).sendKeys(Name);

    }

    public void setCountry(String Country) {
        driver.findElement(country).sendKeys(Country);
    }


    public void setCity(String City) {
        driver.findElement(city).sendKeys(City);
    }


    public void setCard(String Card) {
        driver.findElement(card).sendKeys(Card);
    }


    public void setMonth(String Month) {
        driver.findElement(month).sendKeys(Month);
    }


    public void setYear(String Year) {
        driver.findElement(year).sendKeys(Year);
    }


    public void setPurchase() {
        driver.findElement(purchase).click();
    }

    public void setMSG() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String msg = driver.findElement(MSG).getText();
        Assert.assertEquals(msg, "Thank you for your purchase!");
        System.out.println(msg);
    }


//    public void add2products() {
//        for (int i = 0; i <= 1; i++) {
//            driver.findElement(By.xpath("(//div[@class='card-block']//a)" + "[" + i + "]")).click();
//            driver.findElement(AddToCart1).click();
//            driver.navigate().back();
//
//        }
//    }


}







