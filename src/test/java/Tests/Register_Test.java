package Tests;

import Pages.Register_Page;
import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Register_Test extends TestBase{
    Register_Page login;

    String path="https://www.tutorialspoint.com/selenium/practice/register.php#";

    @Test
    public void Register_Form() throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();
        login = new Register_Page(driver);
        login.Register_Function();
        login.Register_form(jsonReader.fname, jsonReader.lname, jsonReader.uname, jsonReader.password);
        Assert.assertEquals(path,driver.getCurrentUrl());
    }
}