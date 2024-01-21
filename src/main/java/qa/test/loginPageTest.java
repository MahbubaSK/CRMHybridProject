package qa.test;

import BasePage.BaseTest;
import org.testng.annotations.Test;
import pageEvents.ComentoPageEvents;
import pageEvents.CreateNewContactsEvents;
import pageEvents.HomePageEvents;
import pageEvents.loginPageEvents;
public class loginPageTest {

    public class LoginPageTest extends BaseTest {

        // I need to access the method from HomePageEvents and LoginPageEvents class So I create a object with those class name
        // to get the method.

        HomePageEvents homePageEvents = new HomePageEvents();
        loginPageEvents loginPageEvents = new loginPageEvents();
        ComentoPageEvents comentoPageEvents = new ComentoPageEvents();

        CreateNewContactsEvents createNewContactsEvents= new CreateNewContactsEvents();


        /**User opens chrome browser.
         User clicks on ‘login’ button.
         User inputs email.
         User inputs password.
         User clicks on ‘login’ button.
         User Mouse Hover to ‘Contact’ option.
         Users click on the ‘Add’ button.
         User inputs ‘First Name’.
         User inputs ‘Middle Name’.
         User inputs ‘Last Name’.
         User inputs ‘Address’.
         User inputs ‘Email’.
         User inputs ‘Company’.
         User inputs ‘Category’.
         User inputs ‘Phone Number’.
         Users saved the form.
         *
         */
        //How to handel alert/ how to handel browser alert Selenium java?/ how to handel popup massage/
        @Test
        public void loginToTheApplication() throws InterruptedException {
            homePageEvents.signinBTN();
            loginPageEvents.enterCredentials();
            Thread.sleep(3000);
            comentoPageEvents.clickContactAddBTN();
            Thread.sleep(3000);
            createNewContactsEvents.enterCreateNewContactInfo();

        }


    }
}
