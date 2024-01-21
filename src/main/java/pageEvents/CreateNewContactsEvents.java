package pageEvents;


import Utils.ElementFetch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import pageObject.CreateNewContactElements;

import java.nio.file.WatchEvent;
import java.util.List;

import static BasePage.BaseTest.driver;

public class CreateNewContactsEvents {

    ElementFetch elementFetch = new ElementFetch();

    public void enterCreateNewContactInfo() throws InterruptedException {

        Actions action = new Actions(driver);
        action.moveToElement(elementFetch.getWebElement("XPATH", "//input[@name='first_name']")).build().perform();

        Thread.sleep(2000);
        elementFetch.getWebElement("XPATH", CreateNewContactElements.firstName).sendKeys("luna");
        elementFetch.getWebElement("XPATH", CreateNewContactElements.middleName).sendKeys("MTS");
        elementFetch.getWebElement("XPATH", CreateNewContactElements.lastName).sendKeys("nahid");
        Thread.sleep(2000);
        elementFetch.getWebElement("XPATH",CreateNewContactElements.emailId).sendKeys("Borno07@gmail.com");
        elementFetch.getWebElement("XPATH", CreateNewContactElements.streetAddress).sendKeys("213 foxglen");
        elementFetch.getWebElement("XPATH", CreateNewContactElements.city).sendKeys("columbus");
        Thread.sleep(3000);
        elementFetch.getWebElement("XPATH", CreateNewContactElements.stateOrCounty).sendKeys("Ohio");
        elementFetch.getWebElement("XPATH", CreateNewContactElements.postCode).sendKeys("23451");
        Thread.sleep(3000);


        // elementFetch.getWebElement("XPATH", CreateNewContactElements.addressDropdown).click();
        elementFetch.getWebElement("XPATH", CreateNewContactElements.statesDropDown).click();
        // elementFetch.getWebElement("XPATH",CreateNewContactElements.statesDropDown).sendKeys("Uga");
        Thread.sleep(3000);
        List<WebElement> listOfCountry = elementFetch.getWebElements("XPATH", CreateNewContactElements.allCountriesDropDown);
        System.out.println("CountryNumber....." + listOfCountry.size());

        for (int i = 0; i < listOfCountry.size(); i++) {
            String itemText = listOfCountry.get(i).getText();
            if (itemText.equalsIgnoreCase("Uganda")) {
                listOfCountry.get(i).click();//if give get(i) menas i should click inside someone
                break;
            }
        }

        elementFetch.getWebElement("XPATH", CreateNewContactElements.addCountry).click();

        elementFetch.getWebElement("XPATH",CreateNewContactElements.secendStreedAdd).sendKeys("100 fox dr");
        elementFetch.getWebElement("XPATH",CreateNewContactElements.secendCity).sendKeys("Pick");
        elementFetch.getWebElement("XPATH",CreateNewContactElements.secendCounty).sendKeys("Frack");
        elementFetch.getWebElement("XPATH",CreateNewContactElements.secendPostelcode).sendKeys("1234");

        elementFetch.getWebElement("XPATH",CreateNewContactElements.addCountryDropdown).click();

        List<WebElement> addMoreCountry = elementFetch.getWebElements("XPATH", CreateNewContactElements.selectOneCountry);
        int count=0;
        System.out.println("Total country name..." +addMoreCountry.size());

       for(int j =0;j<addMoreCountry.size();j++){

           String secondCountry = addMoreCountry.get(j).getText();
           System.out.println(" country name..." +secondCountry);
           if(secondCountry.equalsIgnoreCase("Bangladesh")){
               addMoreCountry.get(j).click();
            break;
           }

       }
       Thread.sleep(3000);
        elementFetch.getWebElement("XPATH",CreateNewContactElements.companyName).sendKeys("Bizbee");
    //Thread.sleep(2000);
       elementFetch.getWebElement("XPATH",CreateNewContactElements.catagaryDropdown).click();
       List<WebElement> catagoryDrop = elementFetch.getWebElements("XPATH", CreateNewContactElements.selectCatagory);
        System.out.println("catagory name...."+catagoryDrop.size());

      for(int k=0;k<catagoryDrop.size();k++){

          String catDrop = catagoryDrop.get(k).getText();
          System.out.println("type of Catagory...."+  catDrop);
          if(catDrop.equalsIgnoreCase("Customer")){
              catagoryDrop.get(k).click();
              break;
          }
      }

       elementFetch.getWebElement("XPATH",CreateNewContactElements.phoneDropDown).click();

        List<WebElement> countryList = elementFetch.getWebElements("XPATH", CreateNewContactElements.phoneDropCountry);
        System.out.println("country name..."+countryList.size());
        for(int l=0; l<countryList.size();l++) {
            String cName = countryList.get(l).getText();
            System.out.println("this is my number...." + cName);
            if (cName.equalsIgnoreCase("Brazil")) {

                countryList.get(l).click();
                break;
            }
        }
        elementFetch.getWebElement("XPATH",CreateNewContactElements.phonenumber).sendKeys("2134568763");
        elementFetch.getWebElement("XPATH",CreateNewContactElements.namePhoneAdd).sendKeys("work number:1230983456");
        elementFetch.getWebElement("XPATH",CreateNewContactElements.saveDoc).click();



    }



    }

