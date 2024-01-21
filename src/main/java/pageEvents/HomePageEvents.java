package pageEvents;

import Utils.ElementFetch;
import pageObject.homePageElements;

public class HomePageEvents {

    ElementFetch elementFetch= new ElementFetch();

    public void signinBTN(){

        elementFetch.getWebElement("XPATH", homePageElements.HomePageElements.signInBTN).click();



    }






}
