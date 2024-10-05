package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Register_Page {
    WebDriver driver;
    private final By To_Register_form = By.xpath("/html/body/main/div/div/div[1]/div/div[2]/div/div/ul/li[3]/a");
    private final By FirstName = By.xpath("//input[@id=\"firstname\"]");
    private final By LastName = By.xpath("//input[@id=\"lastname\"]");
    private final By UserName = By.xpath("//input[@id=\"username\"]");
    private final By Password = By.xpath("//input[@id=\"password\"]");
    private final By Register_Button= By.xpath("//input[@class=\"btn btn-primary\"]");
    private final By Susses_message = By.xpath("//h1[@class=\"mb-3 fw-normal border-bottom text-left pb-2 mb-4\"]");



    public Register_Page(WebDriver driver){
        this.driver=driver;
    }

    public void Register_Function(){
        driver.findElement(To_Register_form).click();
    }
    public void  Register_form(String F_name , String L_name , String U_name , String Pass){

        driver.findElement(FirstName).sendKeys(F_name);
        driver.findElement(LastName).sendKeys(L_name);
        driver.findElement(UserName).sendKeys(U_name);
        driver.findElement(Password).sendKeys(Pass);
        driver.findElement(Register_Button).click();
        WebElement Success = driver.findElement(Susses_message);
        System.out.println(Success.getText());
        Assert.assertEquals("Welcome,Register",Success.getText());



    }
}
