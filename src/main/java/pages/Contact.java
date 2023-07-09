package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact {
    @FindBy(name = "First Name")
    WebElement firstname;
    @FindBy(name = "Last Name")
    WebElement lastname;
    @FindBy(name = "email")
    WebElement email;
    @FindBy(name = "message")
    WebElement comment;
    @FindBy(css = "[value=\"SUBMIT\"]")
    WebElement submitButton;

}