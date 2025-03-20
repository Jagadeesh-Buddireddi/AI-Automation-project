package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {

    @FindBy(xpath = "//input[@name='username']")
    public static WebElement USER_NAME_TEXT_BOX;

    @FindBy(xpath = "//input[@name='password']")
    public static WebElement PASSWORD_TEXT_BOX;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    public static WebElement REGISTER_LINK;

    @FindBy(xpath = "//input[@id='customer.firstName']")
    public static WebElement FIRST_NAME_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    public static WebElement LAST_NAME_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    public static WebElement ADDRESS_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    public static WebElement CITY_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    public static WebElement STATE_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public static WebElement ZIPCODE_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public static WebElement PHONE_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public static WebElement SSN_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.username']")
    public static WebElement SIGNUP_USERNAME_TEXT_BOX;

    @FindBy(xpath = "//input[@id='customer.password']")
    public static WebElement SIGNUP_PASSWORD_TEXT_BOX;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    public static WebElement CONFIRM_PASSWORD_TEXT_BOX;
}
