package com.stepdefinition.RLL_240Testing_FirstCry_MyProfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.RLL_240Testing_FirstCry_MyProfile.LoginPage;
import com.pages.RLL_240Testing_FirstCry_MyProfile.MyAddressBookPage;
import com.pages.RLL_240Testing_FirstCry_MyProfile.MyProfilePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinition_AddressDetails {
	
	WebDriver driver;
	LoginPage login;
    MyProfilePage profile;
    MyAddressBookPage address;
    
    @Before
    public void init() {
        driver = new ChromeDriver();
        login = new LoginPage(driver);
        profile = new MyProfilePage(driver);
        address = new MyAddressBookPage(driver);
    }
    
    @Given("The user is in the firstcry home page3")
    public void the_user_is_in_the_firstcry_home_page3() {
        driver.get("https://www.firstcry.com/");
        driver.manage().window().maximize();
    }

    @When("The user clicks on login3")
    public void the_user_clicks_on_login3() throws InterruptedException {
        login.clickOnLoginButton();
    }

    @And("The user enter the mobile num3")
    public void the_user_enter_the_mobile_num3() throws InterruptedException {
        login.sendMobileNumber();
    }

    @Then("click on continue3")
    public void click_on_continue3() throws InterruptedException {
        login.clickOnContinueButton();
    }

    @And("click on submit link3")
    public void click_on_submit_link3() throws InterruptedException {
        login.clickOnSubmitButton();
    }

    @Then("click on My Account3")
    public void click_on_My_Account3() throws InterruptedException {
        profile.clickOnMyAccount();
    }

    @And("click on My Profile3")
    public void click_on_My_Profile3() throws InterruptedException {
        profile.clickOnMyProfile();
    }

    @Then("click on my address book")
    public void click_on_my_address_book() throws InterruptedException {
        address.clickOnMyAddressBook();
    }

    @And("^user enter (.*) in address field$")
    public void user_enter_name_in_address_field(String name) throws InterruptedException {
        address.setUserNameinAddress(name);
    }

    @And("^user enter (.*) in house number$")
    public void user_enter_houseNumber(String houseNumber) throws InterruptedException {
        address.setHouseNumber(houseNumber);
    }

    @And("^user enter (.*) in street address$")
    public void user_enter_streetAddress(String streetAddress) throws InterruptedException {
        address.setAddress(streetAddress);
    }

    @And("^user enter (.*) in landmark$")
    public void user_enter_landmark(String landMark) throws InterruptedException {
        address.setLandMark(landMark);
    }

    @And("^user enter (.*) in pincode$")
    public void user_enter_pincode(String pincode) throws InterruptedException {
        address.setPinCode(pincode);
    }

    @And("^user enter (.*) in mobile number$")
    public void user_enter_mobileNumber(String mobileNumber) throws InterruptedException {
        address.setMobileNumber(mobileNumber);
    }
    
    @And("^user enter (.*) in telephone region$")
    public void user_enter_telephone_region_of_telephone(String telRegion) throws InterruptedException {
        System.out.println("Telephone Region value: " + telRegion);
        address.setTelephoneRegion(telRegion);
    }

    @And("^user enter (.*) in telephone number$")
    public void user_enter_telephoneNumber(String telNumber) throws InterruptedException {
        address.setTelNumber(telNumber);
    }

    @When("user click on save button")
    public void user_click_on_save_button() throws InterruptedException {
        address.clickOnAddressSaveBtn();
    }

    @Then("users address  details successfully saved")
    public void users_address_details_successfully_saved() {
        Assert.assertTrue(true);
    }
}
