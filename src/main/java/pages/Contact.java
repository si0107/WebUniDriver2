package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact {
    @FindBy(name="first_name") WebElement firstName;
    @FindBy(name="last_name") WebElement lastName;
    @FindBy(name="email") WebElement email;
    @FindBy(name="message") WebElement comment;
    @FindBy(css = "[value=\"SUBMIT\"]") WebElement submitButton;
}
