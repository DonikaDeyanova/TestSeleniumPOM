import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest {
    @BeforeMethod
    public void setup() {
        Browser.setupDriver();
    }

//    @AfterMethod
//    public void tearDown() {
//        Browser.quitDriver();
//    }
    @Test
    public void registerAccount(){
        RegisterAccountPage.goTo();
        RegisterAccountPage.clickMyAccountDropDown();
        RegisterAccountPage.chooseRegisterFromDropDownMyAccount();
        RegisterAccountPage.writeInTheFirstNameInputField("Donika");
        RegisterAccountPage.writeInTheLastNameInputField("Deyanova");
        RegisterAccountPage.writeInTheEmailInputField();
        RegisterAccountPage.writeInTheTelephoneInputField();
        RegisterAccountPage.writeInThePasswordInputFieldAndConfirm();
        RegisterAccountPage.checkPrivacyPolicy();
        RegisterAccountPage.clickContinueButton();
        RegisterAccountPage.verifyAccountHasBeenCreated();
    }
}
