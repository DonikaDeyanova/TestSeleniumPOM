
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class RegisterAccountPage {
    @FindBy(xpath = "//*[@id='top-links']/ul/li[2]")
    private static WebElement myAccountDropDown;
    @FindBy(xpath = "//*[@id='top-links']/ul/li[2]/ul/li[1]/a")
    private static WebElement myAccountDropDownRegister;
    @FindBy(id = "input-firstname")
    private static WebElement firstNameInputField;
    @FindBy(id = "input-lastname")
    private static WebElement lastNameInputField;
    @FindBy(id = "input-email")
    private static WebElement emailInputField;
    @FindBy(id = "input-telephone")
    private static WebElement telephoneInputField;
    @FindBy(id = "input-password")
    private static WebElement passwordInputFieldAddCustomer;
    @FindBy(id = "input-confirm")
    private static WebElement confirmPasswordInputField;
    @FindBy(xpath = "//*[@id='content']/form/div/div/input[1]")
    private static WebElement privacyPolicyCheckBox;
    @FindBy(xpath = "//*[@id='content']/form/div/div/input[2]")
    private static WebElement continueButton;

    private static final String url = "http://shop.pragmatic.bg";

    static {
        PageFactory.initElements(Browser.getDriver(), RegisterAccountPage.class);
    }
    public static void goTo() {
        Browser.getDriver().get(url);
    }
    public static void clickMyAccountDropDown(){
        myAccountDropDown.click();
    }
    public static void chooseRegisterFromDropDownMyAccount(){
        myAccountDropDownRegister.click();
    }
    public static void writeInTheFirstNameInputField(String firstName){
        firstNameInputField.sendKeys(firstName);
    }
    public static void writeInTheLastNameInputField(String lastName){
        lastNameInputField.sendKeys(lastName);
    }
    public static void writeInTheEmailInputField(){
        String emailPrefix = RandomStringUtils.randomAlphanumeric(7);
        String host = RandomStringUtils.randomAlphabetic(5);
        String randomEmail = emailPrefix + "@" + host + ".com";
        emailInputField.sendKeys(randomEmail);

    }
    public static void writeInTheTelephoneInputField(){
        String telephonePrefix = RandomStringUtils.randomNumeric(9);
        String randomTelephone = "+359"+telephonePrefix;
        telephoneInputField.sendKeys(randomTelephone);
    }
    public static void writeInThePasswordInputFieldAndConfirm(){
        String passwordPrefix = RandomStringUtils.randomAlphanumeric(8);
        passwordInputFieldAddCustomer.sendKeys(passwordPrefix);
        confirmPasswordInputField.sendKeys(passwordPrefix);
    }
    public static void checkPrivacyPolicy(){
        privacyPolicyCheckBox.click();
    }
    public static void clickContinueButton(){
        continueButton.click();
    }
    public static void verifyAccountHasBeenCreated() {
        Assert.assertEquals(Browser.getDriver().getTitle(), "Your Account Has Been Created!");
    }
}
