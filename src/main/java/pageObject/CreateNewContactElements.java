package pageObject;

public interface CreateNewContactElements {

    String firstName="//input[@name='first_name']";
    String middleName="//input[@name='middle_name']";

    String lastName="//input[@name='last_name']";


    String streetAddress="//input[@name='address']";
    String city="//input[@name='city']";
    String stateOrCounty= "(//div[@class='ui input'])[6]//input";
    String postCode="//input[@name='zip']";

    String addressDropdown="(//i[@class='dropdown icon'])[7]";
    String statesDropDown="//div [@name='country']";//1st dropDown for country
     String allCountriesDropDown="//div[@role='listbox']//div";//1st dropdown select all
    String countryName="(//*[text()='Uganda'])[1]";//select any country
    String addCountry="(//button[@class='ui tiny basic icon button'])[3]"; //click add button for add more country

    String secendStreedAdd="(//input[@name='address'])[2]";

    String secendCity="(//input[@name='city'])[2]";
    String secendCounty="(//input[@name='state'])[2]";
    String secendPostelcode="(//input[@name='zip'])[2]";
    String emailId="(//input[@name='value'])[1]";

   String addCountryDropdown="(//i[@class='dropdown icon'])[8]";// select 2nd dropdown for country

   String selectOneCountry="//div[@role='listbox']//div";// when select one specific country
    String companyName="(//input[@class='search'])[1]";
    String catagaryDropdown="(//i[@class='dropdown icon'])[3]";
    String selectCatagory="//div[@class='visible menu transition']//div";//Customer
    String phoneDropDown="(//i[@class='dropdown icon'])[8]";
    String phoneDropCountry="//div[@class='visible menu transition']//div";//Brazil
   String phonenumber="(//input[@name='value'])[3]";
   String namePhoneAdd="(//input[@name='name'])[2]";
   String saveDoc="//button[@class='ui linkedin button']";
   String clickNote="(//i[@class='add icon'])[1]";//if want to add note
   String addNote="//form[@class='ui form']";
           //"(//div[@class='content'])[4]";
   String saveNote="//button[@class='ui green button']";
  //  (//*[text()='Uganda'])[1]
// String addressText= "(//span[text()='United States'])[1]";
    //String addressAddSign="(//i[@class='add icon'])[3]";

 /*String emailAddress ="//input[@placeholder='Email address']";
 String nextEmailBTN="//input[@placeholder='Personal email, Business, Alt...']";
 String emailAddSign="(//i[@class='add icon'])[1]";

 String streetAddress="//input[@name='address']";
 String city="//input[@name='city']";

 String stateOrCounty="(//input[@placeholder='State / County'])[1]";
 (//div[@class='ui input'])[6]

 String postCode="//input[@name='zip']";
 String addressDropdown="(//i[@class='dropdown icon'])[7]";
 String addressAddSign="(//i[@class='add icon'])[3]";
 String searchCompany="(//input[@class='search'])[1]";
 String companySearchIcon="(//i[@class='search icon'])[1]";
 String categoryDropdown="(//i[@class='dropdown icon'])[3]";
*/
}
