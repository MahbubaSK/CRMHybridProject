package pageEvents;

import Utils.ElementFetch;
import pageObject.loginPageElements;

public class loginPageEvents {

    ElementFetch elementFetch= new ElementFetch();

    public void enterCredentials(){

        elementFetch.getWebElement("XPATH", loginPageElements.LoginPageElements.emailAddress).sendKeys("niklas.braven@deecie.com");
        elementFetch.getWebElement("XPATH", loginPageElements.LoginPageElements.passWord).sendKeys("Bizbee@123");
        elementFetch.getWebElement("XPATH", loginPageElements.LoginPageElements.loginBTN).click();

    }




}
