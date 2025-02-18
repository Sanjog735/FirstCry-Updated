package com.pages.RLL_240Testing_FirstCry_MyProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAddressBookPage {

	WebDriver driver;

	public MyAddressBookPage(WebDriver driver) {
		this.driver = driver;
	}


	By myAddressBook = By.xpath("//*[text()='My Address Book']");
	By userName = By.id("txtAddName");
	By houseNo = By.id("txtAddAddress1");
	By address = By.id("txtAddAddress2");
	By landmark = By.id("txtAddAddress3");
	By pinCode = By.id("txtAddPincode");
	By mobile = By.id("txtAddMobile");
	By telReg = By.id("txtregion");
	By telNum = By.id("txtlandline");
	By addressSaveBtn = By.id("btnSaveAddress");

	public void clickOnMyAddressBook() throws InterruptedException {
		driver.findElement(myAddressBook).click();
		Thread.sleep(1000);
	}

	public void setUserNameinAddress(String name) throws InterruptedException {
		driver.findElement(userName).sendKeys(name);
		Thread.sleep(1000);
	}

	public void setHouseNumber(String houseNumber) throws InterruptedException {
		driver.findElement(houseNo).sendKeys(houseNumber);
		Thread.sleep(1000);
	}

	public void setAddress(String streetAddress) throws InterruptedException {
		driver.findElement(address).sendKeys(streetAddress);
		Thread.sleep(1000);
	}

	public void setLandMark(String landMark) throws InterruptedException {
		driver.findElement(landmark).sendKeys(landMark);
		Thread.sleep(1000);
	}

	public void setPinCode(String pincode) throws InterruptedException {
		driver.findElement(pinCode).sendKeys(pincode);
		Thread.sleep(4000);
	}

	public void setMobileNumber(String mobileNumber) throws InterruptedException {
		driver.findElement(mobile).sendKeys(mobileNumber);
		Thread.sleep(1000);
	}

	public void setTelephoneRegion(String telRegion) throws InterruptedException {
		driver.findElement(telReg).sendKeys(telRegion);
		Thread.sleep(100);
	}

	public void setTelNumber(String telNumber) throws InterruptedException {
		driver.findElement(telNum).sendKeys(telNumber);
		Thread.sleep(1000);
	}

	public void clickOnAddressSaveBtn() {
		driver.findElement(addressSaveBtn).click();
	}

}
