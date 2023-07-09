package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact {

    @FindBy(name = "first_name") private WebElement firstName;
    @FindBy(name = "last_name") private WebElement lastName;
    @FindBy(name = "email") private WebElement email;
    @FindBy(name = "message") private WebElement comments;
    @FindBy(css = "[value=\"RESET\"]") private WebElement resetButton;
    @FindBy(css = "[value=\"SUBMIT\"]") private WebElement submitButton;
}
