package com.stepdefinition.RLL_240Testing_FirstCry_MyProfile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resource\\com\\features\\MyProfile\\AddressDetails.feature", 
glue = "com.stepdefinition.RLL_240Testing_FirstCry_MyProfile")
public class NewTest extends AbstractTestNGCucumberTests {
}
