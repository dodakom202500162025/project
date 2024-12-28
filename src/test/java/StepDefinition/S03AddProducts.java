package StepDefinition;

import Pages.AddPoducts.AddProducts;
import TestData.Configurations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S03AddProducts {

    AddProducts addProducts = new AddProducts(Hooks.driver);

    @Given("The user is on the homepage")
    public void setHomePage()  {
        addProducts.setHomePage();
    }

    @When("user Click on Laptops under categories on the homepage")
    public void setLaptopsCat() {
        addProducts.setLaptopsCat();
    }


//    @And("Choose Products and Click on the Add to Cart button1")
//    public void add2product () throws InterruptedException {
//        addProducts.add2products();
//    }

    @And("Choose Product 1")
    public void setProduct1() {
        addProducts.setProduct1();
    }


    @And("Click on the Add to Cart button1")
    public void setAddToCart1() {
        addProducts.setAddToCart();
    }


   @Then("Product 1 is added to the cart with confirmation")
   public void confirmMsg()  {
        addProducts.confirmMsg();
   }

   @And("back to homepage")
   public void setDriver(){
        addProducts.setDriver();
   }

   @And("user Click on Laptops")
   public void setLaptopsCat1(){
        addProducts.setLaptopsCat1();
   }
   @And("Choose Product 2")
   public void setAddProduct2(){
        addProducts.setProduct2();
   }

   @And("Click on the Add to Cart button")
   public  void setAddToCart2(){
        addProducts.setAddToCart2();
   }

   @And("Product 2 is added to the cart with confirmation")
   public void msg() {
        addProducts.confirmMsg2();
   }
    @When("click on cart button")
    public void setCartButton() {
        addProducts.setCartButton();
    }


       @And("Verify that products are displayed in the cart title")
    public void setTitle() {
        addProducts.setTitle();
    }

    @And("Verify that products are displayed in the cart price")
    public void setPrice() {
        addProducts.setPrice();
    }

    @Then("products are visible in the cart, with their respective titles")
    public void setTitleDisplay() {
        addProducts.setTitleDisplay();
    }

    @Then("products are visible in the cart, with their respective prices")
    public void setPriceDisplay() {
        addProducts.setPriceDisplay();
    }
    @When("Click on the Place order button")
    public void setpOrder(){
        addProducts.setpOrder();
    }

    @And("Verify that the total amount is calculated correctly on the placeholder page")
    public void setTotalPRICE() throws InterruptedException {
        addProducts.setTotalPRICE();
    }

    @And("Fill in Name")
    public void setName() {

       addProducts.setName(Configurations.name);
    }

    @And("Country")
    public void setCountry(){

     addProducts.setCountry(Configurations.country);
    }

    @And("City")
    public void setCity(){

        addProducts.setCity(Configurations.city);
    }

    @And("Credit Card Number")
    public void setCard(){

        addProducts.setCard(Configurations.card);
    }

    @And("Month")
    public void setMonth(){
       addProducts.setMonth(Configurations.month);
    }

    @And("Year")
    public void setYear(){
       addProducts.setYear(Configurations.year);
    }
    @And("Click on the Purchase button")
    public void setPurchase(){
        addProducts.setPurchase();
    }

    @Then("A success message should be displayed:Thank you for your purchase!")
    public void setMSG(){
       addProducts.setMSG();
    }






}
